package com.pta.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.pta.entity.PatientEntity;
import com.pta.model.PatientPOJO;

public class PatientDAOImpl implements PatientDAO{
	public void addPatientDetails(PatientPOJO pojo) {

		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
	    PatientEntity patientEntity = new PatientEntity();
	    patientEntity.setFirstName(pojo.getFirstName());
	    patientEntity.setLastName(pojo.getLastName());
	    patientEntity.setAge(pojo.getAge());
	    patientEntity.setAddressLine1(pojo.getAddressLine1());
	    patientEntity.setAddressLine2(pojo.getAddressLine2());
	    patientEntity.setAlternateContactNumber(pojo.getAlternateContactNumber());
	    patientEntity.setCity((pojo.getCity()));
	    patientEntity.setContactNumber(pojo.getContactNumber());
	    patientEntity.setDateOfBirth(pojo.getDateOfBirth());
	    patientEntity.setEmailId(pojo.getEmailId());
	    patientEntity.setGender(pojo.getGender());
	    patientEntity.setState(pojo.getState());
	    patientEntity.setZipCode(pojo.getZipCode());

		session.save(patientEntity);
		transaction.commit();
		session.close();
	}
	
	public  ArrayList fetchPatientDetails() {
		ArrayList patientDetails=null;
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		
		List list=session.createQuery("from PatientEntity").list();
		patientDetails=new ArrayList();
		for(int i=0;i< list.size();i++)
			{
			 PatientEntity patientEntity=(PatientEntity)list.get(i);
			 PatientPOJO pojo = new PatientPOJO();
			 pojo.setAddressLine1(patientEntity.getAddressLine1());
			 pojo.setAddressLine2(patientEntity.getAddressLine2());
			 pojo.setAge(patientEntity.getAge());
			 pojo.setAlternateContactNumber(patientEntity.getAlternateContactNumber());
			 pojo.setCity(patientEntity.getCity());
			 pojo.setPatientId(patientEntity.getPatientId());
			 pojo.setContactNumber(patientEntity.getContactNumber());
			 pojo.setDateOfBirth(patientEntity.getDateOfBirth());
			 pojo.setEmailId(patientEntity.getEmailId());
			 pojo.setFirstName(patientEntity.getFirstName());
			 pojo.setGender(patientEntity.getGender());
			 pojo.setLastName(patientEntity.getLastName());
			 pojo.setState(patientEntity.getState());
			 pojo.setZipCode(patientEntity.getZipCode());
			 patientDetails.add(pojo);
			}
		
		session.close();
		return patientDetails;
	}
	
	
public void updatePatientDetails(PatientPOJO pojo) {
		
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		PatientEntity patientEntity = session.get(PatientEntity.class, pojo.getPatientId());
		patientEntity.setFirstName(pojo.getFirstName());
		patientEntity.setLastName(pojo.getLastName());
		patientEntity.setAge(pojo.getAge());
		patientEntity.setAddressLine1(pojo.getAddressLine1());
		patientEntity.setAddressLine2(pojo.getAddressLine2());
		patientEntity.setAlternateContactNumber(pojo.getAlternateContactNumber());
		patientEntity.setCity((pojo.getCity()));
		patientEntity.setContactNumber(pojo.getContactNumber());
		patientEntity.setDateOfBirth(pojo.getDateOfBirth());
		patientEntity.setEmailId(pojo.getEmailId());
		patientEntity.setGender(pojo.getGender());
		patientEntity.setState(pojo.getState());
		patientEntity.setZipCode(pojo.getZipCode());
		
		transaction.commit();
		session.close();
	}
	
}
