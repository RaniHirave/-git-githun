package com.sunbeaminfo.sh.bookshop.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunbeaminfo.sh.bookshop.models.Login;
import com.sunbeaminfo.sh.bookshop.pojos.Customer;
import com.sunbeaminfo.sh.bookshop.services.LoginService;

@Controller
public class LoginControllerImpl {
	@Autowired
	private LoginService loginService;
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doLogin(Login login, Model model) {
		Customer cust = loginService.validateLogin(login.getEmail(), login.getPassword());
		if(cust == null) {
			model.addAttribute("login", login);
			return "failed";
		} else {
			model.addAttribute("cust", cust);
			return "redirect:subjects";
		}
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String doHome(Model model) {
		model.addAttribute("cred", new Login("rani.hirave@cognologix.com", ""));
		return "index";
	}
	@RequestMapping("/logout")
	public String doLogout(HttpSession session) {
		session.invalidate();
		return "logout";
	}
}

