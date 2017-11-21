package focus.wagen.controllers;

import java.security.Principal;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
/**
 * httpエラー（サーバエラー）
 */
@Controller
public class ErrorsController implements ErrorController {

	private static final Logger logger = LoggerFactory.getLogger(ErrorsController.class);
	
	private final static String ERROR_PATH = "/error";
	
	@Autowired
	private ErrorAttributes errorAttributes;
	
	/**
	 * httpエラー（サーバエラー）
	 * 
	 * @param Locale locale
	 * @param Model model
	 * @param Principal principal
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value={ERROR_PATH})
	public ModelAndView errorHtml(Locale locale, Model model, Principal principal, HttpServletRequest request, HttpServletResponse response) {
		// Logger
		logger.info("Welcome error! The client locale is {}.", locale);
		
		// Get status error and redirect page
		Map<String, Object> mapErrorAttributes =  getErrorAttributes(request, true);
		Integer intHttpStatus = response.getStatus();
		String strPath = ((String) mapErrorAttributes.get("path"));
		strPath = strPath != null? strPath.replaceFirst("/", "") : "";
		
		// Set model data
		model.addAttribute("intHttpStatus", intHttpStatus);
		model.addAttribute("strPath", strPath);
		
		return new ModelAndView("Errors/errors");
	}
	/**
	 * パスエラーを取得する
	 * 
	 * @return ERROR_PATH 
	 *         パスエラー
	 */
	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
	/**
	 * エラー属性を取得する
	 * 
	 * @param boolean includeStackTrace
	 * @param HttpServletRequest request
	 * 
	 * @return Map<String, Object> ErrorAttributes
	 */
	private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
		RequestAttributes requestAttributes = new ServletRequestAttributes(request);
		return errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
	}
}
