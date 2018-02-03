package com.niit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	

	@RequestMapping("/")
	public String homePage(Model model) {

		return "home";
	}


	@RequestMapping("/Login")
	public String loginPage(Model model) {

		return "Login";
	}
	


	@RequestMapping("NewUser")
	public String signupPage(Model model) {

		return "NewUser";
	}
}