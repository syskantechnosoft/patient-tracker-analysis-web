package com.pta.service;

import java.util.ArrayList;

import com.pta.model.ClerkPOJO;

public interface ClerkService {
	
	public void addClerkDetails(ClerkPOJO pojo); 
	public  ArrayList fetchClerkDetails();
	public void updateClerkDetails(ClerkPOJO pojo);

}
