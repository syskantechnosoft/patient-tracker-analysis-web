package com.pta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorController {

	@RequestMapping("/listAllDoctor")
	public String listAllDoctor() {
		return "ListAllDoctor";
	}
	
}
