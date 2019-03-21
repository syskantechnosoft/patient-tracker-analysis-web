package com.pta.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pta.entity.ClerkEntity;
import com.pta.model.ClerkPOJO;

public class ClerkDAOImpl implements ClerkDAO {
	public void addClerkDetails(ClerkPOJO pojo) {
			
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		ClerkEntity clerkEntity = new ClerkEntity();
		clerkEntity.setFirstName(pojo.getFirstName());
		clerkEntity.setLastName(pojo.getLastName());
		clerkEntity.setAge(pojo.getAge());
		clerkEntity.setAddressLine1(pojo.getAddressLine1());
		clerkEntity.setAddressLine2(pojo.getAddressLine2());
		clerkEntity.setAlternateContactNumber(pojo.getAlternateContactNumber());
		clerkEntity.setCity((pojo.getCity()));
		clerkEntity.setContactNumber(pojo.getContactNumber());
		clerkEntity.setDateOfBirth(pojo.getDateOfBirth());
		clerkEntity.setEmailId(pojo.getEmailId());
		clerkEntity.setGender(pojo.getGender());
		clerkEntity.setState(pojo.getState());
		clerkEntity.setZipCode(pojo.getZipCode());

		session.save(clerkEntity);
		transaction.commit();
		session.close();

	}
	
	
	public  ArrayList fetchClerkDetails() {
		ArrayList clerkDetails=null;
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		
		List list=session.createQuery("from ClerkEntity").list();
		clerkDetails=new ArrayList();
		for(int i=0;i< list.size();i++)
			{
			 ClerkEntity clerkEntity=(ClerkEntity)list.get(i);
			 ClerkPOJO pojo = new ClerkPOJO();
			 pojo.setAddressLine1(clerkEntity.getAddressLine1());
			 pojo.setAddressLine2(clerkEntity.getAddressLine2());
			 pojo.setAge(clerkEntity.getAge());
			 pojo.setAlternateContactNumber(clerkEntity.getAlternateContactNumber());
			 pojo.setCity(clerkEntity.getCity());
			 pojo.setClerkId(clerkEntity.getClerkId());
			 pojo.setContactNumber(clerkEntity.getContactNumber());
			 pojo.setDateOfBirth(clerkEntity.getDateOfBirth());
			 pojo.setEmailId(clerkEntity.getEmailId());
			 pojo.setFirstName(clerkEntity.getFirstName());
			 pojo.setGender(clerkEntity.getGender());
			 pojo.setLastName(clerkEntity.getLastName());
			 pojo.setState(clerkEntity.getState());
			 pojo.setZipCode(clerkEntity.getZipCode());
			 clerkDetails.add(pojo);
			}
		
		session.close();
		return clerkDetails;
	}
	
	public void updateClerkDetails(ClerkPOJO pojo) {
		
		SessionFactory sessionfactory = null;
		Session session = null;
		
		sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		ClerkEntity clerkEntity = session.get(ClerkEntity.class, pojo.getClerkId());
		clerkEntity.setFirstName(pojo.getFirstName());
		clerkEntity.setLastName(pojo.getLastName());
		clerkEntity.setAge(pojo.getAge());
		clerkEntity.setAddressLine1(pojo.getAddressLine1());
		clerkEntity.setAddressLine2(pojo.getAddressLine2());
		clerkEntity.setAlternateContactNumber(pojo.getAlternateContactNumber());
		clerkEntity.setCity((pojo.getCity()));
		clerkEntity.setContactNumber(pojo.getContactNumber());
		clerkEntity.setDateOfBirth(pojo.getDateOfBirth());
		clerkEntity.setEmailId(pojo.getEmailId());
		clerkEntity.setGender(pojo.getGender());
		clerkEntity.setState(pojo.getState());
		clerkEntity.setZipCode(pojo.getZipCode());
		
		transaction.commit();
		session.close();
	}
	
	
}
