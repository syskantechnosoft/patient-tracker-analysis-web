package com.pta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pta.model.MedicinePOJO;
import com.pta.model.PatientPOJO;
import com.pta.service.MedicineService;
import com.pta.service.MedicineServiceImpl;
import com.pta.service.PatientService;
import com.pta.service.PatientServiceImpl;

@Controller
public class PatientController {

	@RequestMapping(value="/listAllPatient")
	public String listAllClerk(HttpServletRequest request) {
		
		PatientService patientService = new PatientServiceImpl();
		ArrayList patientDetails = patientService.fetchPatientDetails();
		request.setAttribute("patientDetails", patientDetails);
		return "ListAllPatient";
	}
	
	
	
	@RequestMapping("/addPatientForm")
	public String addClerkForm(ModelMap map) {
		map.addAttribute("patient", new PatientPOJO());
		return "AddPatient";
	}
	
	@RequestMapping(value="/addPatient", method=RequestMethod.POST)
	public String addClerk(HttpServletRequest request, ModelMap map, @ModelAttribute("Patient") PatientPOJO pojo) {
		
		PatientService patientService=new PatientServiceImpl();		
		String patientId = patientService.addPatientDetails(pojo);
		map.addAttribute("id", patientId);
		request.setAttribute("success", "successs");
		
		ArrayList patientDetails = patientService.fetchPatientDetails();
		request.setAttribute("patientDetails", patientDetails);
		
		return "ListAllPatient";
	}
}
