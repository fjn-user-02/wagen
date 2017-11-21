package focus.wagen.controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import focus.wagen.dao.StaffMstDao;
import focus.wagen.entity.StaffMst;

/**
 * ログイン
 */
@Controller
public class LoginController {

	@Autowired
	private StaffMstDao staffMstDao;

	@Autowired
	DataSource dataSource;
	
	/**
	 * ユーザーのログイン
	 * 
	 * @return View
	 * @throws SQLException 
	 */
	@RequestMapping(value={"/shop"})
	public ModelAndView userLogin(Model model) {
		try {
			model.addAttribute("errorDb", false);
			Connection connection = dataSource.getConnection();
			if (!connection.isValid(30)) {
				model.addAttribute("errorDb", true);
			}
		} catch (Exception e) {
			model.addAttribute("errorDb", true);
		}
		return new ModelAndView("Login/shop");
	}

	/**
	 * 管理者のログイン
	 * 
	 * @return View
	 * @throws SQLException 
	 */
	@RequestMapping(value={"/admin"})
	public ModelAndView adminLogin(Model model) {
		try {
			model.addAttribute("errorDb", false);
			Connection connection = dataSource.getConnection();
			if (!connection.isValid(30)) {
				model.addAttribute("errorDb", true);
			}
		} catch (Exception e) {
			model.addAttribute("errorDb", true);
		}
		return new ModelAndView("Login/admin");
	}

	/**
	 * パスワード変更
	 * 
	 * @return View
	 */
	@RequestMapping(value={"/change_password"}, method=RequestMethod.GET)
	public ModelAndView changePassword(Locale locale, Model model,
			@RequestParam(name="loginUrl") String loginUrl) {
		// Set data
		model.addAttribute("loginUrl", loginUrl);
		model.addAttribute("loginError", false);
		return new ModelAndView("Login/change_password");
	}

	/**
	 * 更新処理
	 * 
	 * @param locale
	 * @param model
	 * @param username
	 * @param password
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value={"/change_password"}, method=RequestMethod.POST)
	public ModelAndView updateStaff(Locale locale, Model model,
			@RequestParam(name="username") String username,
			@RequestParam(name="password") String password,
			@RequestParam(name="loginUrl") String loginUrl) {

		// Get staff info
		StaffMst staffMst = new StaffMst();
		staffMst = staffMstDao.findByAccount(username);

		// User name do not exists
		if (staffMst == null) {
			model.addAttribute("loginUrl", loginUrl );
			model.addAttribute("loginError", true);
			return new ModelAndView("Login/change_password");
		}

		// Update staff
		staffMst.setAccount(username);
		staffMst.setPassword(password);
		staffMst.setUpdateDate(getCurrentDate());
		staffMst.setUpdateUser(staffMst.getId());
		staffMstDao.save(staffMst);

		return new ModelAndView("redirect:/" + loginUrl);
	}
	
	/**
	 * 現在の日付を取得する
	 * 
	 * @return Date
	 */
	private Date getCurrentDate() {
		long millis = System.currentTimeMillis();  
		return new Date(millis);  
	}
}