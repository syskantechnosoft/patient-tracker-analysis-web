package com.pta.service;

import java.util.ArrayList;

import com.pta.model.PatientPOJO;

public interface PatientService {
	public void addPatientDetails(PatientPOJO pojo);
	public  ArrayList fetchPatientDetails();
	public void updatePatientDetails(PatientPOJO pojo);
}
