package com.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeEntry {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		
		
		Employee e6 = new Employee (6 , "JS", 6000);
		
		
		
		Configuration config = new Configuration ().configure(); 
		SessionFactory sf= config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(e6);
		
		tr.commit();
		session.close();
		System.out.println("data saverr..................");
	}

}
