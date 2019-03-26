package com.pta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientController {

	@RequestMapping("/listAllPatient")
	public String listAllDoctor() {
		return "ListAllPatient";
	}
	
}
