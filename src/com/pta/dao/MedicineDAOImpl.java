package com.pta.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pta.entity.MedicineEntity;
import com.pta.model.MedicinePOJO;

public class MedicineDAOImpl implements MedicineDAO{
	public void addMedicineDetails(MedicinePOJO pojo) {
		
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		MedicineEntity medicineEntity = new MedicineEntity();
		medicineEntity.setAmount(pojo.getAmount());
		medicineEntity.setCureFor(pojo.getCureFor());
		medicineEntity.setDosage(pojo.getDosage());
		medicineEntity.setManufacturingCompany(pojo.getManufacturingCompany());
		medicineEntity.setMedicineDescription(pojo.getMedicineDescription());
		medicineEntity.setPrescribedFor(pojo.getPrescribedFor());
		
		session.save(medicineEntity);
		transaction.commit();
		session.close();
	}
	
	public ArrayList fetchMedicineDetails() {
		
		ArrayList medicineDetails=null;
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		
		List list=session.createQuery("from MedicineEntity").list();
		medicineDetails=new ArrayList();
		for(int i=0;i< list.size();i++) {
			
			MedicineEntity medicineEntity = (MedicineEntity)list.get(i);
			MedicinePOJO pojo = new MedicinePOJO();
			pojo.setMedicineId(medicineEntity.getMedicineId());
			pojo.setAmount(medicineEntity.getAmount());
			pojo.setCureFor(medicineEntity.getCureFor());
			pojo.setDosage(medicineEntity.getDosage());
			pojo.setManufacturingCompany(medicineEntity.getManufacturingCompany());
			pojo.setMedicineDescription(medicineEntity.getMedicineDescription());
			pojo.setPrescribedFor(medicineEntity.getPrescribedFor());
			medicineDetails.add(pojo);
		}
		
		session.close();
		return medicineDetails;
	}
	
	public void updateMedicineDetails(MedicinePOJO pojo) {
		
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		MedicineEntity medicineEntity = session.get(MedicineEntity.class, pojo.getMedicineId());
		medicineEntity.setAmount(pojo.getAmount());
		medicineEntity.setCureFor(pojo.getCureFor());
		medicineEntity.setDosage(pojo.getDosage());
		medicineEntity.setManufacturingCompany(pojo.getManufacturingCompany());
		medicineEntity.setMedicineDescription(pojo.getMedicineDescription());
		medicineEntity.setPrescribedFor(pojo.getPrescribedFor());
		
		transaction.commit();
		session.close();
	}
}
