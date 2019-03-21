package com.pta.dao;

import java.util.ArrayList;

import com.pta.model.ClerkPOJO;

public interface ClerkDAO {
	
	public void addClerkDetails(ClerkPOJO pojo);
	public  ArrayList fetchClerkDetails();
	public void updateClerkDetails(ClerkPOJO pojo);
}
