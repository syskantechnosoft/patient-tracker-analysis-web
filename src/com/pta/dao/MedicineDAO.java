package com.pta.dao;

import java.util.ArrayList;

import com.pta.model.MedicinePOJO;

public interface MedicineDAO {
	public String addMedicineDetails(MedicinePOJO pojo);
	public ArrayList fetchMedicineDetails();
	public void updateMedicineDetails(MedicinePOJO pojo);
	
}
