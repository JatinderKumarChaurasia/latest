package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class StartupController {

	@RequestMapping("/login")
	public String doLogin(Model model) {
		return "login";
	}
	
	
	@RequestMapping("/index")
	public String welcome(Model model) {
		return "index";
	}
}
