package com.pta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pta.model.DoctorPOJO;

@Controller
public class DoctorController {

	@RequestMapping("/listAllDoctor")
	public String listAllDoctor() {
		return "ListAllDoctor";
	}
	
	@RequestMapping("/addDoctorForm")
	public String addClerkForm(ModelMap map) {
		map.addAttribute("doctor", new DoctorPOJO());
		return "AddDoctor";
	}
}
