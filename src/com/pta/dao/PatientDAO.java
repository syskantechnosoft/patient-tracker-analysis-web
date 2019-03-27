package com.pta.dao;

import java.util.ArrayList;

import com.pta.model.PatientPOJO;

public interface PatientDAO {
	public String addPatientDetails(PatientPOJO pojo);
	public  ArrayList fetchPatientDetails();
	public void updatePatientDetails(PatientPOJO pojo);
}
