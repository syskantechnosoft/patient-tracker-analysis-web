package com.pta.service;

import com.pta.dao.LoginDao;
import com.pta.dao.LoginDaoImpl;
import com.pta.model.AdminPOJO;

public class LoginServiceImpl implements LoginService{

	public int checkAdmin(AdminPOJO admin)
	{
		LoginDao validateAdmin = new LoginDaoImpl();
		int check = validateAdmin.checkAdmin(admin);
		return check;
	}
	
	public String getName(int id)
	{
		LoginDao userName = new LoginDaoImpl();
		String name = userName.getName(id);
		return name;
	}
	
}
