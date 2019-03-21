package com.pta.dao;
import com.pta.model.AdminPOJO;

public interface LoginDao 
{

	public int checkAdmin(AdminPOJO admin);

	public String getName(int id);
}
