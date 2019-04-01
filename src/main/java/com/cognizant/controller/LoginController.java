package com.cognizant.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.model.Customer;
import com.cognizant.model.Login;
import com.cognizant.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String doLogin(@ModelAttribute("login") Login login) {
		return "login";
	}

	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doLogin(@ModelAttribute("login") Login login,HttpSession session,BindingResult result){
		if(loginService.authenticate(login)){
			System.out.println("Hello");
		}else{
			System.out.println("Hi");
		}
		System.out.println(login.getUserId());
		return "login";
	}
}