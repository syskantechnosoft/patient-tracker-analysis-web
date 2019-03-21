package com.pta.dao;

import java.util.ArrayList;

import com.pta.model.DoctorPOJO;

public interface DoctorDAO {

	public void addDoctorDetails(DoctorPOJO pojo);
	public  ArrayList fetchDoctorDetails();
	public void updateDoctorDetails(DoctorPOJO pojo);
}
