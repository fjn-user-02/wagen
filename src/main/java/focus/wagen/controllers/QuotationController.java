package focus.wagen.controllers;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import focus.wagen.dao.StaffMstDao;
import focus.wagen.entity.DealerMst;
import focus.wagen.entity.EstimationHistoryTran;
import focus.wagen.entity.QuotationWrapper;
import focus.wagen.entity.StaffMst;
import focus.wagen.entity.TaxMst;
import focus.wagen.service.CreateNumTblService;
import focus.wagen.service.EstimationHistoryTranService;
import focus.wagen.service.EstimationTranService;
import focus.wagen.service.ModelMstService;
import focus.wagen.service.TaxMstService;
import focus.wagen.utils.Md5;
/**
 * 見積り詳細
 */
@Controller
public class QuotationController {

	private static final Logger logger = LoggerFactory.getLogger(QuotationController.class);
	@Autowired
	protected AuthenticationManager authenticationManager;
	@Autowired
	private TemplateEngine templateEngine;
	@Autowired
	private ModelMstService modelMstService;
	@Autowired
	private TaxMstService taxMstService;
	@Autowired
	private CreateNumTblService createNumTblrService;
	@Autowired
	private JavaMailSender sender;
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private EstimationTranService estimationTranService;
	@Autowired
	private EstimationHistoryTranService estimationHistoryTranService;
	@Autowired
	private StaffMstDao staffMstDao;
	@Value("${spring.mail.username}")
	private String emailAddress;
	/**
	 * 見積り詳細
	 * 
	 * @param Locale locale
	 * @param Model model
	 * @param Integer modelId
	 *                車種マスタID
	 * @param Integer generationId
	 *                車種世代マスタID
	 * @param Integer categoryId
	 *                アイテムカテゴリマスタID
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping("/quotation")
	public ModelAndView quotation(Locale locale, Model model,
							@RequestParam(required=false, name="model_id") Integer modelId,
							@RequestParam(required=false, name="generation_id") Integer generationId,
							@RequestParam(required=false, name="ctg") Integer categoryId,
							@RequestParam(required=false, name="quotationumber") String quotatioNumber) throws Exception {
		
		logger.info("Welcome quotation! The client locale is {}.", locale);
		
		// Get info
		HashMap<String, Object> quotationInfo = modelMstService.getQuotationInfoByModelId(modelId, generationId);
		
		// Get object dealer
		@SuppressWarnings("unchecked")
		DealerMst objDealer = ((Map<String, DealerMst>) model).get("objDealer");
		
		// Get object staff
		@SuppressWarnings("unchecked")
		StaffMst objStaff  = ((Map<String, StaffMst>) model).get("objStaff");
		
		// Get estimate number
		String estimateNumber = createNumTblrService.getEstimateNumber(objDealer, objStaff.getId());

		// Get object tax
		TaxMst objTax = taxMstService.getOneTax();
		
		// Get account info
		String account = Md5.encode(objStaff.getAccount());
		String password = Md5.encode(objStaff.getPassword());
		
		// Get data attribute
		String className = "quotation_wrapper";
		
		// Get data history
		if(quotatioNumber != null && !quotatioNumber.isEmpty()) {
			getDataHistory(model, quotatioNumber);
			estimateNumber = quotatioNumber;
			className = "quotation_wrapper database";
		}
		
		// Set model
		model.addAttribute("modelId", modelId);
		model.addAttribute("generationId", generationId);
		model.addAttribute("categoryId", categoryId);
		model.addAttribute("modelName", quotationInfo.get("modelName"));
		model.addAttribute("modelType", quotationInfo.get("modelType"));
		model.addAttribute("estimateNumber", estimateNumber);
		model.addAttribute("objTax", objTax);
		model.addAttribute("account", account);
		model.addAttribute("password", password);
		model.addAttribute("className", className);
		
		// Render
		return new ModelAndView("Quotation/index");
	}

	/**
	 * メール
	 * 
	 * @param Locale locale
	 * @param Model model
	 * @param HttpServletRequest request
	 * 
	 * @return Map<String, String> result
	 *                             メール配信結果
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value= "/sendmail", produces = "application/json", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> sendMail(Locale locale, Model model, HttpServletRequest request,
										Principal principal, @RequestBody QuotationWrapper quotationList) throws Exception {
		logger.info("Welcome send mail! The client locale is {}.", locale);
		
		// New result object
		Map<String, String> result = new HashMap<String, String>();
		
		// Get status and message success
		String status = messageSource.getMessage("mail.status.success", null, locale);
		String message = "";
		try {
			// Get object staff
			StaffMst objStaffMst  = ((Map<String, StaffMst>) model).get("objStaff");
			
			// Get data for save
			String quotationNumber = quotationList.getQuotationNumber();
			
			// Save data
			estimationTranService.saveAll(objStaffMst, quotationList);
			estimationHistoryTranService.saveAll(objStaffMst, quotationList);
			
			// Send email
			if (quotationList.getIsSendMail() == 1) {
				message = messageSource.getMessage("mail.message.success", null, locale);
				String url = String.format("%s://%s:%d",request.getScheme(), request.getServerName(), request.getServerPort()) + quotationList.getUrlPrint();
				sendEmail(locale, url, quotationNumber, objStaffMst);
			} else {
				message = messageSource.getMessage("save.message.success", null, locale);
			}
		} catch (Exception ex) {
			// Get status and message error
			status = messageSource.getMessage("mail.status.error", null, locale);
			if (quotationList.getIsSendMail() == 1) {
				message = messageSource.getMessage("mail.message.error", null, locale);
			} else {
				message = messageSource.getMessage("save.message.error", null, locale);
			}
			ex.printStackTrace();
		}
		result.put("status", status);
		result.put("message", message);
		return result;
	}

	/**
	 * 見積り印刷
	 * 
	 * @param locale
	 * @param model
	 * @param estimatedNumber
	 *        見積番号
	 * @return ModelAndView
	 */
	@RequestMapping(value={"/print"})
	public ModelAndView print(Locale locale
							, Model model
							, @RequestParam(name="quotationumber") String estimatedNumber) {
		logger.info("Welcome print! The client locale is {}.", locale);

		getDataHistory(model, estimatedNumber);

		return new ModelAndView("Quotation/print");
	}

	/**
	 * Get data for print/history
	 * 
	 * @param model
	 * @param estimatedNumber
	 * @return model
	 */
	private Model getDataHistory(Model model, String estimatedNumber) {
		// Get object staff
		@SuppressWarnings("unchecked")
		StaffMst objStaff  = ((Map<String, StaffMst>) model).get("objStaff");
		
		// Get data histories
		List<EstimationHistoryTran> histories = estimationHistoryTranService.getEstimationHistoryTran(objStaff.getShopMst().getId(), objStaff.getDealerMst().getId(), estimatedNumber);

		// Get tax value
		BigDecimal taxValue = null;
		if (histories.size() > 0) {
			taxValue = histories.get(0).getTaxMst().getTax();
		}
		// Format ArrayList to ArrayJson 
		JSONArray arrayCart = new JSONArray();
		JSONArray arrayCharge = new JSONArray();
		for (EstimationHistoryTran history : histories) {
			JSONObject cart = new JSONObject();
			JSONObject charge = new JSONObject();
			try {
				String partNo = "";
				if (history.getPartsNo1() != null) {
					partNo += history.getPartsNo1();
				}
				if (history.getPartsNo2() != null) {
					partNo += " " + history.getPartsNo2();
				}
				if (history.getPartsNo3() != null) {
					partNo += " " + history.getPartsNo3();
				}
				if (history.getPartsNo4() != null) {
					partNo += " " + history.getPartsNo4();
				}
				// Add cart
				cart.put("id", history.getItemCode());
				cart.put("model_id", history.getModelMst().getId());
				cart.put("img_src", history.getImgPath());
				cart.put("item_name", history.getItemName());
				cart.put("code", partNo);
				cart.put("campaign_name", history.getSaleTitle());
				cart.put("campaign_class", "campaign c" + history.getSaleTag());
				cart.put("unit_price", history.getPrice());
				cart.put("quantity", history.getQuantity());
				cart.put("wage", history.getInstallTime() != null ? history.getInstallTime() : "");
				cart.put("paint_fee", history.getItemPaintPrice());
				cart.put("discount", history.getItemDiscount());
				cart.put("sale_tag", history.getSaleTag());
				String paintFlg = "true";
				if (history.getCampaignMst() != null) {
					cart.put("obj_id", history.getCampaignMst().getId());
					cart.put("cmp_flg", 1);
					if (history.getCampaignMst().getPaintFlg() == null || history.getCampaignMst().getPaintFlg() == false) {
						paintFlg = "false";
					}
					cart.put("paint_flg", paintFlg);
				} else if (history.getItemMst() != null) {
					cart.put("obj_id", history.getItemMst().getId());
					cart.put("cmp_flg", 0);
					if (history.getItemMst().getPaintFlg() == null || history.getItemMst().getPaintFlg() == false) {
						paintFlg = "false";
					}
					cart.put("paint_flg", paintFlg);
				}

				// Add charge
				charge.put("paint", history.getPaintPrice());
				charge.put("discount", history.getTotalDiscount());
				charge.put("memo", history.getMemo());

			} catch (JSONException e) {
				e.printStackTrace();
			}
			arrayCart.put(cart.toString());
			arrayCharge.put(charge.toString());
		}

		model.addAttribute("arrayCart", arrayCart.toString());
		model.addAttribute("arrayCharge", arrayCharge.toString());
		model.addAttribute("estimatedNumber", estimatedNumber);
		model.addAttribute("taxValue", taxValue);

		return model;
	}
	/**
	 * 見積り印刷
	 * 
	 * @param locale
	 * @param model
	 * @param estimatedNumber
	 *        見積番号
	 * @param account
	 *        アカウント
	 * @param password
	 *        パスワード
	 * @return ModelAndView
	 */
	@RequestMapping(value={"print/autologin"})
	public ModelAndView printAutoLogin(HttpServletRequest request, Principal principal, Locale locale
							, Model model
							, @RequestParam(name="quotationumber") String estimatedNumber
							, @RequestParam(required=false, name="account") String account
							, @RequestParam(required=false, name="password") String password) {
		logger.info("Welcome print with auto login! The client locale is {}.", locale);

		if (principal == null && account != null && password != null) {
			StaffMst StaffMst = staffMstDao.findByAccountAndPassword(account, password);
			if (StaffMst != null) {
				UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(account, password);
				// generate session if one doesn't exist
				request.getSession();
				token.setDetails(new WebAuthenticationDetails(request));
				Authentication authenticatedUser = authenticationManager.authenticate(token);
				SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
			}
		}
		return new ModelAndView("redirect:/print?quotationumber=" + estimatedNumber);
	}

	/**
	 * 電子メール機能を送信する
	 * 
	 * @param Locale locale
	 * @param String url
	 *               「見積り印刷」ページのURL
	 * @param String quotationNumber
	 *               見積番号
	 * @param StaffMst objStaffMst
	 *               スタッフマスタ
	 */
	private void sendEmail(Locale locale, String url, String quotationNumber, StaffMst objStaffMst) throws Exception {
		// New context for template
		Context context = new Context();
		context.setVariable("url", url);
		context.setVariable("staffName", objStaffMst.getDealerMst().getDealerName());
		context.setVariable("quotationNumber", quotationNumber);
		// New message
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(emailAddress);
		helper.setTo(objStaffMst.getDealerMst().getMail());
		helper.setText(templateEngine.process("Emails/quotation", context), true);
		helper.setSubject(messageSource.getMessage("mail.quotation.title", new Object[] {quotationNumber}, locale));
		// Send message
		sender.send(message);
	}
}
