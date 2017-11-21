package focus.wagen.controllers;

import java.security.Principal;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import focus.wagen.entity.ModelMst;
import focus.wagen.service.IModelMstService;

/**
 * ホーム
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private IModelMstService modelMstService;

	/**
	 * ホーム
	 * 
	 * @param Locale locale
	 * @param Model model
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value={"/", "/index"})
	public ModelAndView home(Locale locale, Model model, Principal principal) {

		logger.info("Welcome home! The client locale is {}.", locale);

		// Get all model
		List<ModelMst> models = modelMstService.getAllModels();

		// Set data
		model.addAttribute("models", models );

		// Render
		return new ModelAndView("Home/index");
	}
}
