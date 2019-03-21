package com.pta.service;

import java.util.ArrayList;

import com.pta.dao.DoctorDAO;
import com.pta.dao.DoctorDAOImpl;
import com.pta.model.DoctorPOJO;

public class DoctorServiceImpl implements DoctorService {
	
	public void addDoctorDetails(DoctorPOJO pojo) {
		DoctorDAO doctorDAO = new DoctorDAOImpl();
		doctorDAO.addDoctorDetails(pojo);
	}
	
	
	public  ArrayList fetchDoctorDetails() {
		DoctorDAO doctorDAO = new DoctorDAOImpl();
		ArrayList doctorDetails=new ArrayList();
		doctorDetails=doctorDAO.fetchDoctorDetails();
		return doctorDetails;
	}
	
	
	public void updateDoctorDetails(DoctorPOJO pojo) {
		DoctorDAO doctorDAO = new DoctorDAOImpl();
		doctorDAO.updateDoctorDetails(pojo);
	}

}
