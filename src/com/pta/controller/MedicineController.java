package com.pta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pta.model.MedicinePOJO;

@Controller
public class MedicineController {

	

		@RequestMapping("/listAllMedicine")
		public String listAllDoctor() {
			return "ListAllMedicine";
		}
		
		@RequestMapping("/addMedicineForm")
		public String addClerkForm(ModelMap map) {
			map.addAttribute("medicine", new MedicinePOJO());
			return "AddMedicine";
		}
}
