package com.pta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pta.model.PrescriptionPOJO;

@Controller
public class PrescriptionController {

	@RequestMapping("/listAllPrescription")
	public String listAllDoctor() {
		return "ListAllPrescription";
	}
	
	@RequestMapping("/addPrescriptionForm")
	public String addClerkForm(ModelMap map) {
		map.addAttribute("prescription", new PrescriptionPOJO());
		return "AddPrescription";
	}
}
