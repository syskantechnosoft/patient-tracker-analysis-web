package com.pta.service;

import com.pta.model.AdminPOJO;

public interface LoginService {

	public int checkAdmin(AdminPOJO admin);
	
	public String getName(int id);
	
}
