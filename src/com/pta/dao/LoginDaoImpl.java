package com.pta.dao;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pta.entity.AdminEntity;
import com.pta.model.AdminPOJO;

public class LoginDaoImpl implements LoginDao{

		
	public int checkAdmin(AdminPOJO admin)
	{
		int check = 0;
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		AdminEntity adminEntity = new AdminEntity();
		
		adminEntity.setAdminId(Integer.parseInt(admin.getAdminId()));
		adminEntity.setPassword(admin.getPassword());
		
		List l1 = (List) session.createQuery("from AdminEntity where Admin_Id='"+adminEntity.getAdminId()+"' and password='"+adminEntity.getPassword()+"'").list();
		
		Iterator iterator = l1.iterator();
		
		if(iterator.hasNext())
		{
			check = 1;
		}
		
		else
		{
			check = 0;
		}
		
		return check;
	}
	
	public String getName(int id)
	{
		StringBuilder builder = new StringBuilder();
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		AdminEntity adminEntity = new AdminEntity();
		
		adminEntity.setAdminId(id);
		
		List l1 = (List) session.createQuery("from AdminEntity where Admin_Id='"+adminEntity.getAdminId()+"'").list();
		
		Iterator iterator = l1.iterator();
		
		if(iterator.hasNext())
		{
			AdminEntity adminName = (AdminEntity)l1.get(0);
			builder.append(adminName.getFirstName());
		}
		
		String name = builder.toString();
		return name;
	}
	
}
