package com.pta.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pta.entity.DoctorEntity;
import com.pta.model.DoctorPOJO;

public class DoctorDAOImpl implements DoctorDAO{

	public void addDoctorDetails(DoctorPOJO pojo) {
		
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		DoctorEntity doctorEntity = new DoctorEntity();
		doctorEntity.setFirstName(pojo.getFirstName());
		doctorEntity.setLastName(pojo.getLastName());
		doctorEntity.setAge(pojo.getAge());
		doctorEntity.setAddressLine1(pojo.getAddressLine1());
		doctorEntity.setAddressLine2(pojo.getAddressLine2());
		doctorEntity.setAlternateContactNumber(pojo.getAlternateContactNumber());
		doctorEntity.setCity((pojo.getCity()));
		doctorEntity.setContactNumber(pojo.getContactNumber());
		doctorEntity.setDateOfBirth(pojo.getDateOfBirth());
		doctorEntity.setEmailId(pojo.getEmailId());
		doctorEntity.setGender(pojo.getGender());
		doctorEntity.setState(pojo.getState());
		doctorEntity.setZipCode(pojo.getZipCode());
		doctorEntity.setDegree(pojo.getDegree());
		doctorEntity.setSpeciality(pojo.getSpeciality());
		doctorEntity.setWorkHours(pojo.getWorkHours());
		doctorEntity.setHospitalName(pojo.getHospitalName());
		
		session.save(doctorEntity);
		transaction.commit();
		session.close();

		
		
	}
	
	public  ArrayList fetchDoctorDetails() {
		ArrayList doctorDetails=null;
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		
		List list=session.createQuery("from DoctorEntity").list();
		doctorDetails=new ArrayList();
		for(int i=0;i< list.size();i++)
			{
			 DoctorEntity doctorEntity=(DoctorEntity)list.get(i);
			 DoctorPOJO pojo = new DoctorPOJO();
			 pojo.setAddressLine1(doctorEntity.getAddressLine1());
			 pojo.setAddressLine2(doctorEntity.getAddressLine2());
			 pojo.setAge(doctorEntity.getAge());
			 pojo.setAlternateContactNumber(doctorEntity.getAlternateContactNumber());
			 pojo.setCity(doctorEntity.getCity());
			 pojo.setDoctorId(Long.toString(doctorEntity.getDoctorId()));
			 pojo.setContactNumber(doctorEntity.getContactNumber());
			 pojo.setDateOfBirth(doctorEntity.getDateOfBirth());
			 pojo.setEmailId(doctorEntity.getEmailId());
			 pojo.setFirstName(doctorEntity.getFirstName());
			 pojo.setGender(doctorEntity.getGender());
			 pojo.setLastName(doctorEntity.getLastName());
			 pojo.setState(doctorEntity.getState());
			 pojo.setZipCode(doctorEntity.getZipCode());
			 pojo.setDegree(doctorEntity.getDegree());
			 pojo.setSpeciality(doctorEntity.getSpeciality());
			 pojo.setWorkHours(doctorEntity.getWorkHours());
			 pojo.setHospitalName(doctorEntity.getHospitalName());
			 doctorDetails.add(pojo);
			}
		
		session.close();
		return doctorDetails;
	}
	
	
public void updateDoctorDetails(DoctorPOJO pojo) {
		
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		DoctorEntity doctorEntity = session.get(DoctorEntity.class, pojo.getDoctorId());
		doctorEntity.setFirstName(pojo.getFirstName());
		doctorEntity.setLastName(pojo.getLastName());
		doctorEntity.setAge(pojo.getAge());
		doctorEntity.setAddressLine1(pojo.getAddressLine1());
		doctorEntity.setAddressLine2(pojo.getAddressLine2());
		doctorEntity.setAlternateContactNumber(pojo.getAlternateContactNumber());
		doctorEntity.setCity((pojo.getCity()));
		doctorEntity.setContactNumber(pojo.getContactNumber());
		doctorEntity.setDateOfBirth(pojo.getDateOfBirth());
		doctorEntity.setEmailId(pojo.getEmailId());
		doctorEntity.setGender(pojo.getGender());
		doctorEntity.setState(pojo.getState());
		doctorEntity.setZipCode(pojo.getZipCode());
		doctorEntity.setDegree(pojo.getDegree());
		doctorEntity.setSpeciality(pojo.getSpeciality());
		doctorEntity.setWorkHours(pojo.getWorkHours());
		doctorEntity.setHospitalName(pojo.getHospitalName());
		
		
		transaction.commit();
		session.close();
	}
	
}
