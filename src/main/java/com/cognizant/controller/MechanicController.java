package com.cognizant.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.model.Customer;
import com.cognizant.model.Mechanic;
import com.cognizant.services.CustomerService;
import com.cognizant.services.MechanicService;

@Controller
public class MechanicController {
	
	@Autowired
	private MechanicService mechanicService;

	@RequestMapping(value = "/mechanicSignUp", method = RequestMethod.GET)
	public String callSignUp(@ModelAttribute("mechanic") Mechanic mechanic) {
		return "mechanicSignUp";
	}

	@RequestMapping(value = "/mechanicSignUp", method = RequestMethod.POST)
	public String callSignUp(@ModelAttribute("mechanic") Mechanic mechanic, HttpSession session,
			BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:index";
		} else {
			mechanicService.save(mechanic);
			System.out.println("hogya");
			return "mechanicSignUP";
		}
		
	}

}
