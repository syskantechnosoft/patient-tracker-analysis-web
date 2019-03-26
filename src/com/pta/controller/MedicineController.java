package com.pta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MedicineController {

	

		@RequestMapping("/listAllMedicine")
		public String listAllDoctor() {
			return "ListAllMedicine";
		}
}
