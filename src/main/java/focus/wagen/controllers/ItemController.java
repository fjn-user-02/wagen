package focus.wagen.controllers;

import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import focus.wagen.service.ModelMstService;

/**
 * アイテム
 */
@Controller
public class ItemController {

	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ModelMstService modelMstService;

	/**
	 * アイテム一覧
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
	@RequestMapping("/item")
	public ModelAndView item(Locale locale, Model model,
							@RequestParam(required=false, name="model_id") Integer modelId,
							@RequestParam(required=false, name="generation_id") Integer generationId,
							@RequestParam(required=false, name="ctg") Integer categoryId) {
		logger.info("Welcome home! The client locale is {}.", locale);
		// Get items info
		HashMap<String, Object> itemsInfo = modelMstService.getItemInfoByModelId(modelId, generationId, categoryId);
		// Set data
		model.addAttribute("modelId", modelId);
		model.addAttribute("generationId", generationId);
		model.addAttribute("categoryId", categoryId);
		model.addAttribute("items", itemsInfo.get("items"));
		model.addAttribute("categorys", itemsInfo.get("categorys"));
		model.addAttribute("modelName", itemsInfo.get("modelName"));
		model.addAttribute("modelType", itemsInfo.get("modelType"));
		// Render
		return new ModelAndView("Item/index");
	}
}
