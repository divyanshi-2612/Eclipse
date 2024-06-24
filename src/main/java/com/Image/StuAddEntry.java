package com.Image;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StuAddEntry  {

	public static void main(String[] args) throws Exception 
	{
		Configuration config = new Configuration ().configure(); 
		SessionFactory sf= config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		StuAdd s1 = new StuAdd();
		s1.setStreet("street1");
		s1.setCity("INDOREEEE");
		s1.setOpen(true);
		s1.setAddedDate(new Date());
		s1.setX(1234.234);
		FileInputStream fi = new FileInputStream("src/main/resources/pic.png");
		byte[] data = new byte[fi.available()];
		fi.read(data);
		s1.setImage(data);
		
		session.save(s1);
		
		
		
		tr.commit();
		session.close();
		System.out.println("data saverrrrrrrrrrr");

	}

}
