package com.pta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrescriptionController {

	@RequestMapping("/listAllPrescription")
	public String listAllDoctor() {
		return "ListAllPrescription";
	}
}
