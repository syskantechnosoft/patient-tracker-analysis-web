package com.pta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pta.model.PatientPOJO;

@Controller
public class PatientController {

	@RequestMapping("/listAllPatient")
	public String listAllDoctor() {
		return "ListAllPatient";
	}
	
	@RequestMapping("/addPatientForm")
	public String addClerkForm(ModelMap map) {
		map.addAttribute("patient", new PatientPOJO());
		return "AddPatient";
	}
}
