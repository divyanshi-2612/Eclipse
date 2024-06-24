package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopEntry {

	public static void main(String[] args)
	{
		Laptop l1 = new Laptop ("L1","HP",35000);
		Laptop l2 = new Laptop ("L2","DELL",40000 );
		Laptop l3 = new Laptop ("L3","ASUS",45000);
		
		Configuration config = new Configuration ().configure(); 
		SessionFactory sf= config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(l1);
		session.save(l2);
		session.save(l3);
		tr.commit();
		session.close();
		System.out.println("LAPTOP   data saveeeeeeeee");

	}

}
