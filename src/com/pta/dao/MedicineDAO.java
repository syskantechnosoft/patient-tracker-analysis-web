package com.pta.dao;

import java.util.ArrayList;

import com.pta.model.MedicinePOJO;

public interface MedicineDAO {
	public void addMedicineDetails(MedicinePOJO pojo);
	public ArrayList fetchMedicineDetails();
	public void updateMedicineDetails(MedicinePOJO pojo);
	
}
