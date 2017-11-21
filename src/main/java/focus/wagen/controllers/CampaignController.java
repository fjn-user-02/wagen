package focus.wagen.controllers;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import focus.wagen.entity.DealerMst;
import focus.wagen.service.ModelMstService;

/**
 * キャンペーン
 */
@Controller
public class CampaignController {

	private static final Logger logger = LoggerFactory.getLogger(CampaignController.class);

	@Autowired
	private ModelMstService modelMstService;

	/**
	 * キャンペーン一覧
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
	@RequestMapping("/campaign")
	public ModelAndView campaign(Locale locale, Model model,
							@RequestParam(required=false, name="model_id") Integer modelId,
							@RequestParam(required=false, name="generation_id") Integer generationId,
							@RequestParam(required=false, name="ctg") Integer categoryId) {
		logger.info("Welcome campaign! The client locale is {}.", locale);
		// Get object dealer
		@SuppressWarnings("unchecked")
		DealerMst objDealer = ((Map<String, DealerMst>) model).get("objDealer");
		// Get campaigns info
		HashMap<String, Object> campaignsInfo = modelMstService.getCampaignInfoByModelId(modelId, generationId, objDealer);
		// Set data
		model.addAttribute("modelId", modelId);
		model.addAttribute("generationId", generationId);
		model.addAttribute("categoryId", categoryId);
		model.addAttribute("campaigns", campaignsInfo.get("campaigns"));
		model.addAttribute("modelName", campaignsInfo.get("modelName"));
		model.addAttribute("modelType", campaignsInfo.get("modelType"));
		// Render
		return new ModelAndView("Campaign/index");
	}
}
