package com.main;
import org.hibernate.Session;



import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class StudentEntry 
{

	
	public static void main(String[] args) 
	{
		
        
        
        Student s16 = new Student (116, "DURGESH", "INTERVIEW", 975,"23-04-24");
        Student s17 = new Student (117, "RISHI", "INTERVIEW", 980,"24-04-24");
        Student s18 = new Student (118, "SHUBHAM", "INTERVIEW", 985,"25-04-24");
        Student s19 = new Student (119, "ROHIT", "INTERVIEW", 990,"26-04-24");
        
		
		
		
		Configuration config = new Configuration ().configure(); 
		SessionFactory sf= config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(s16);
		session.save(s17);
		session.save(s18);
		session.save(s19);
		
		
		tr.commit();
		session.close();
		System.out.println("data saverrrrrrrrrrr");
	}

}
