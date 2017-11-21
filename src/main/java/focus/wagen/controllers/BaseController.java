package focus.wagen.controllers;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import focus.wagen.dao.StaffMstDao;
import focus.wagen.entity.EstimationHistoryTran;
import focus.wagen.entity.StaffMst;
import focus.wagen.service.IEstimationHistoryTranService;
import focus.wagen.service.IPublicViewMstService;

/**
 * Controller advice - get all data for header and footer
 */
@Controller
@ControllerAdvice(assignableTypes = {HomeController.class, ItemController.class, CampaignController.class, QuotationController.class})
public class BaseController {
	@Autowired
	private IEstimationHistoryTranService estimationHistoryTranService;
	@Autowired
	private StaffMstDao staffMstDao;
	@Autowired
	private IPublicViewMstService publicViewMstService;

	/**
	 * モデルを作成する
	 * 
	 * @param Locale locale
	 * @param Model model
	 */
	@ModelAttribute
	public void populateModel(Model model, Principal principal) {
		if (principal != null) {
			// Get user login
			String accountMd5 = principal != null ? principal.getName() : "";
	
			// Get data banners
			StaffMst staffMst = staffMstDao.findByAccountMd5(accountMd5);

			// Get data histories
			List<EstimationHistoryTran> histories = estimationHistoryTranService.getAllEstimationHistories(staffMst.getShopMst().getId(), staffMst.getDealerMst().getId());
			
			// Get banners info
			HashMap<String, Object> bannersInfo =
				publicViewMstService.getAllPublicViews(staffMst.getShopMst().getShopCode(), staffMst.getDealerMst().getDealerCode());
	
			// Set data
			model.addAttribute("userName", staffMst.getAccount());
			model.addAttribute("histories", histories );
			model.addAttribute("banners", bannersInfo.get("banners"));
			model.addAttribute("bannerSize", bannersInfo.get("bannerSize"));
			model.addAttribute("movies", bannersInfo.get("movies"));
			model.addAttribute("catalogs", bannersInfo.get("catalogs"));
			model.addAttribute("objStaff", staffMst);
			model.addAttribute("objDealer", staffMst.getDealerMst());
		}
	}
}
