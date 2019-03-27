package com.pta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pta.model.ClerkPojo;
import com.pta.service.ClerkService;
import com.pta.service.ClerkServiceImpl;

@Controller
public class ClerkController {
	
	StringBuilder builder = new StringBuilder();
	int check = 0; 
	
	@RequestMapping(value = "/listAllClerk") 
	public String listAllClerk(HttpServletRequest request,ModelMap map) {
		ClerkService clerkService=new ClerkServiceImpl();
		ArrayList clerkDetails = clerkService.fetchClerkDetails();
		if(check == 1)
		{
			String id = builder.toString();
			map.addAttribute("id", id);
			builder.setLength(0);
			request.setAttribute("success", "success");
		}
		request.setAttribute("clerkDetails", clerkDetails);
	    return "ListAllClerk"; 
	}
	
	@RequestMapping("/enterClerkDetails")
	public String enterClerkDetails(ModelMap model) {
		model.addAttribute("clerk", new ClerkPojo()); 
		return "EnterClerkDetails";
	}
	
	@RequestMapping(value="/addClerk", method=RequestMethod.POST)
	public String addClerk(HttpServletRequest request, @ModelAttribute("clerk") ClerkPojo pojo) {
		
		ClerkService clerkService=new ClerkServiceImpl();
		
		
		String id = clerkService.addClerkDetails(pojo);
		builder.append(id);
		
		check = 1; 
		return "redirect:listAllClerk";
	}

}
