package com.pta.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.pta.model.ClerkPOJO;
import com.pta.service.ClerkService;
import com.pta.service.ClerkServiceImpl;

@Controller
public class ClerkController {
	
	@RequestMapping("/listAllClerk")
	public String listAllClerk() {
		return "ListAllClerk";
	}
	
	@RequestMapping("/addClerkForm")
	public String addClerkForm(ModelMap map) {
		map.addAttribute("clerk", new ClerkPOJO());
		return "AddClerk";
	}
	
	
	@RequestMapping(value="/addClerk", method=RequestMethod.POST)
	public String addClerk(HttpServletRequest request, ModelMap map, @ModelAttribute("admin") ClerkPOJO pojo) {
		
		ClerkService clerkService=new ClerkServiceImpl();

		pojo.setFirstName(request.getParameter("fname"));
		pojo.setLastName(request.getParameter("lname"));
		pojo.setAge(Integer.parseInt(request.getParameter("age")));
		pojo.setAddressLine1(request.getParameter("addressl1"));
		pojo.setAddressLine2(request.getParameter("addressl2"));
		pojo.setAlternateContactNumber(Integer.parseInt(request.getParameter("altcontact")));
		pojo.setCity(request.getParameter("city"));
		pojo.setContactNumber(Integer.parseInt(request.getParameter("contactnumber")));
		pojo.setDateOfBirth(request.getParameter("dob"));
		pojo.setEmailId(request.getParameter("email"));
		pojo.setGender(request.getParameter("gender"));
		pojo.setState(request.getParameter("state"));
		pojo.setZipCode(request.getParameter("zipcode"));
		

		clerkService.addClerkDetails(pojo);
		return "ListAllClerk";
	}

}
