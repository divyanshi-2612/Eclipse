package com.mapping;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) 
	{
		Emp e1 = new Emp(101,"Ram",15000, new Laptop("L1","Dell",45000));
		Emp e2 = new Emp(102,"Shyam",20000, new Laptop("L2","HP",55000));
		Emp e3 = new Emp(103,"krishna",25000, new Laptop("L3","Lenevo",65000));
		
		Configuration config = new Configuration ().configure(); 
		SessionFactory sf= config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tr.commit();
		session.close();
		System.out.println("data saveeeeeeeee");
	

	}

}
