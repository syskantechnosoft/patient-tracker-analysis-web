package com.pta.controller;

import java.util.ArrayList;

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
	
	@RequestMapping(value="/listAllClerk")
	public String listAllClerk(HttpServletRequest request) {
		
		ClerkService clerkService = new ClerkServiceImpl();
		ArrayList clerkDetails = clerkService.fetchClerkDetails();
		request.setAttribute("clerkDetails", clerkDetails);
		return "ListAllClerk";
	}
	
	
	@RequestMapping("/clerkAddition")
	public String clerkAddition(ModelMap map) {
		map.addAttribute("clerk", new ClerkPOJO());
		return "AddClerk";
	}
	
	
	@RequestMapping(value="/addClerk", method=RequestMethod.POST)
	public String addClerk(HttpServletRequest request, ModelMap map, @ModelAttribute("clerk") ClerkPOJO pojo) {
		
		ClerkService clerkService=new ClerkServiceImpl();		
		String id = clerkService.addClerkDetails(pojo);
		map.addAttribute("id", id);
		request.setAttribute("success", "successs");
		
		ArrayList clerkDetails = clerkService.fetchClerkDetails();
		request.setAttribute("clerkDetails", clerkDetails);
		
		return "ListAllClerk";
	}

}
