package com.pta.service;

import java.util.ArrayList;
import com.pta.dao.PatientDAO;
import com.pta.dao.PatientDAOImpl;
import com.pta.model.PatientPOJO;

public class PatientServiceImpl implements PatientService{
	public void addPatientDetails(PatientPOJO pojo) {
		PatientDAO patientDAO = new PatientDAOImpl();
		patientDAO.addPatientDetails(pojo);
	}
	
	public  ArrayList fetchPatientDetails() {
		PatientDAO patientDAO = new PatientDAOImpl();
		ArrayList patientDetails=new ArrayList();
		patientDetails=patientDAO.fetchPatientDetails();
		return patientDetails;
	}
	
	public void updatePatientDetails(PatientPOJO pojo) {
		PatientDAO patientDAO = new PatientDAOImpl();
		patientDAO.updatePatientDetails(pojo);
	}
}
