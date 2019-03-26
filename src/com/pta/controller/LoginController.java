package com.pta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pta.model.AdminPOJO;
import com.pta.service.LoginService;
import com.pta.service.LoginServiceImpl;
import com.pta.validation.LoginValidation;
import com.pta.validation.LoginValidationImpl;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String login(ModelMap map) {
	    map.addAttribute("admin", new AdminPOJO());
		return "Home";
	}

	@RequestMapping(value="/loginAdmin", method=RequestMethod.POST)
	public String loginAdmin(HttpServletRequest request, @ModelAttribute("admin") AdminPOJO pojo, ModelMap map) {
		
		LoginValidation loginValidation = new LoginValidationImpl();
		//if(loginValidation.loginValidation(pojo)) {
			//AdminPOJO admin = new AdminPOJO();
			
			int id = Integer.parseInt(pojo.getAdminId().substring(3));
			
			/*
			 * admin.setAdminId(pojo.getAdminId().substring(3));
			 * admin.setPassword(pojo.getPassword());
			 */
			
			pojo.setAdminId(pojo.getAdminId().substring(3));
			pojo.setPassword(pojo.getPassword());
			
			LoginService userLogin = new LoginServiceImpl();
			int check = userLogin.checkAdmin(pojo);
			
			if(check != 0)
			{
				String name = userLogin.getName(id); 
				
				HttpSession session = request.getSession();
				session.setAttribute("name", name);
				
				return "Dashboard";
			}
			
			else
			{
				request.setAttribute("failure", "failure");
				return "Home";
			}	
		}
		
	/*
	 * else { request.setAttribute("failure", "failure"); return "Home"; }
	 * 
	 * }
	 */
}
