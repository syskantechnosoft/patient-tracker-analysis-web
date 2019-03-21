package com.pta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pta.model.AdminPOJO;
import com.pta.service.RegisterService;
import com.pta.service.RegisterServiceImpl;

@Controller
public class RegisterController {
	
	@RequestMapping("/register")
	public String register(ModelMap map) {
		map.addAttribute("admin", new AdminPOJO());
		return "Registration";
	}
	
	@RequestMapping(value="/registerAdmin", method=RequestMethod.POST)
	public String registerAdmin(ModelMap map, @ModelAttribute("admin") AdminPOJO pojo) {
		
		if(pojo.getPassword().equals(pojo.getConfirmPassword())) {
			
			RegisterService newAdmin = new RegisterServiceImpl();
			String id = newAdmin.addAdmin(pojo);
			map.addAttribute("id", id);
			return "AdminHome";
		}
		
		else {
			return "PasswordError";
		}

	}

}
