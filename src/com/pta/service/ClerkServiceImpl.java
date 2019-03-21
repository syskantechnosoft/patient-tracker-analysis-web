package com.pta.service;

import java.util.ArrayList;

import com.pta.dao.ClerkDAO;
import com.pta.dao.ClerkDAOImpl;
import com.pta.model.ClerkPOJO;

public class ClerkServiceImpl implements ClerkService{
	
	public void addClerkDetails(ClerkPOJO pojo) {
		ClerkDAO clerkDAO = new ClerkDAOImpl();
		clerkDAO.addClerkDetails(pojo);
	
	}
	
	public ArrayList fetchClerkDetails() {
		ClerkDAO clerkDAO = new ClerkDAOImpl();
		ArrayList clerkDetails=new ArrayList();
		clerkDetails=clerkDAO.fetchClerkDetails();
		return clerkDetails;
	}
	
	public void updateClerkDetails(ClerkPOJO pojo) {
		ClerkDAO clerkDAO = new ClerkDAOImpl();
		clerkDAO.updateClerkDetails(pojo);
	}
	
}
