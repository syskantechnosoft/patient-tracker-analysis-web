package com.pta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pta.model.MedicinePOJO;
import com.pta.service.MedicineService;
import com.pta.service.MedicineServiceImpl;

@Controller
public class MedicineController {

		
		
		@RequestMapping(value="/listAllMedicine")
		public String listAllClerk(HttpServletRequest request) {
			
			MedicineService medicineService = new MedicineServiceImpl();
			ArrayList medicineDetails = medicineService.fetchMedicineDetails();
			request.setAttribute("medicineDetails", medicineDetails);
			return "ListAllMedicine";
		}
		
		
		
		@RequestMapping("/addMedicineForm")
		public String addClerkForm(ModelMap map) {
			map.addAttribute("medicine", new MedicinePOJO());
			return "AddMedicine";
		}
		
		@RequestMapping(value="/addMedicine", method=RequestMethod.POST)
		public String addClerk(HttpServletRequest request, ModelMap map, @ModelAttribute("medicine") MedicinePOJO pojo) {
			
			MedicineService medicineService=new MedicineServiceImpl();		
			String medicineId = medicineService.addMedicineDetails(pojo);
			map.addAttribute("id", medicineId);
			request.setAttribute("success", "successs");
			
			ArrayList medicineDetails = medicineService.fetchMedicineDetails();
			request.setAttribute("medicineDetails", medicineDetails);
			
			return "ListAllMedicine";
		}
}
