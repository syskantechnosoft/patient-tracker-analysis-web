package com.pta.service;

import com.pta.dao.LoginDao;
import com.pta.dao.LoginDaoImpl;
import com.pta.dao.RegisterDao;
import com.pta.dao.RegisterDaoImpl;
import com.pta.model.AdminPOJO;

public class RegisterServiceImpl implements RegisterService{

	public String addAdmin(AdminPOJO admin)
	{
			RegisterDao newAdmin = new RegisterDaoImpl();
			String id = newAdmin.addAdmin(admin);
			return id;
	}
	
}
