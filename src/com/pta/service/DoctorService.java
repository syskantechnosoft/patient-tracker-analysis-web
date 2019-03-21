package com.pta.service;

import java.util.ArrayList;

import com.pta.model.DoctorPOJO;

public interface DoctorService {

	public void addDoctorDetails(DoctorPOJO pojo); 
	public  ArrayList fetchDoctorDetails();
	public void updateDoctorDetails(DoctorPOJO pojo);
}
