package com.pta.service;

import java.util.ArrayList;

import com.pta.model.MedicinePOJO;

public interface MedicineService {
	public void addMedicineDetails(MedicinePOJO pojo);
	public ArrayList fetchMedicineDetails();
	public void updateMedicineDetails(MedicinePOJO pojo);

}
