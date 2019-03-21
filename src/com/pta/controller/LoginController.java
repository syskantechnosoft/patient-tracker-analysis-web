package com.pta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pta.model.AdminPOJO;
import com.pta.service.LoginService;
import com.pta.service.LoginServiceImpl;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String login(ModelMap map) {
	    map.addAttribute("admin", new AdminPOJO());
		return "Home";
	}

	@RequestMapping(value="/loginAdmin", method=RequestMethod.POST)
	public String loginAdmin(HttpServletRequest request, /*@RequestParam("id") String idString, @RequestParam("password") String password*/@ModelAttribute("admin") AdminPOJO pojo, ModelMap map) {
		
		AdminPOJO admin = new AdminPOJO();
		int id = Integer.parseInt(pojo.getAdminId().substring(3));
		admin.setAdminId(pojo.getAdminId().substring(3));
		admin.setPassword(pojo.getPassword());
		
		LoginService userLogin = new LoginServiceImpl();
		int check = userLogin.checkAdmin(admin);
		
		if(check != 0)
		{
			String name = userLogin.getName(id); 
			
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			
			return "Dashboard";
		}
		
		else
		{
			return "InvalidUser";
		}		
	}
}
