package com.pta.service;

import java.util.ArrayList;

import com.pta.dao.MedicineDAO;
import com.pta.dao.MedicineDAOImpl;
import com.pta.model.MedicinePOJO;

public class MedicineServiceImpl implements MedicineService{
	public void addMedicineDetails(MedicinePOJO pojo) {
		MedicineDAO medicineDAO = new MedicineDAOImpl();
		medicineDAO.addMedicineDetails(pojo);
	}

	public ArrayList fetchMedicineDetails() {
		MedicineDAO medicineDAO = new MedicineDAOImpl();
		ArrayList medicineDetails = new ArrayList();
		medicineDetails = medicineDAO.fetchMedicineDetails();
		return medicineDetails;
	}

	public void updateMedicineDetails(MedicinePOJO pojo) {
		MedicineDAO medicineDAO = new MedicineDAOImpl();
		medicineDAO.updateMedicineDetails(pojo);		
	}
	
	

}
