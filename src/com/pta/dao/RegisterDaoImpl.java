package com.pta.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pta.entity.AdminEntity;
import com.pta.model.AdminPOJO;

public class RegisterDaoImpl implements RegisterDao{

	public String addAdmin(AdminPOJO admin)
	{
		StringBuilder builder = new StringBuilder();
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		AdminEntity adminEntity = new AdminEntity();
		
		adminEntity.setFirstName(admin.getFirstName());
		adminEntity.setLastName(admin.getLastName());
		adminEntity.setAge(admin.getAge());
		adminEntity.setGender(admin.getGender());
		adminEntity.setDateOfBirth(admin.getDateOfBirth());
		adminEntity.setContactNumber(admin.getContactNumber());
		adminEntity.setAlternateContactNumber(admin.getAlternateContactNumber());
		adminEntity.setEmailId(admin.getEmailId());
		adminEntity.setPassword(admin.getPassword());
		
		
		try
		{
			session.save(adminEntity);
			transaction.commit();
			
			List l1 = (List) session.createQuery("from AdminEntity").list();
			
			Iterator iterator = l1.iterator();
			
			if(iterator.hasNext())
			{
				AdminEntity adminId = (AdminEntity)l1.get(l1.size()-1);
				builder.append("ADN");
				builder.append(Long.toString(adminId.getAdminId()));
				System.out.println(builder);
			}
		}
		
		catch(HibernateException he)
		{
			he.printStackTrace();
		}
		
		String id = builder.toString();
		
		return id;
	}
}
