//Task update data in hibernate using update method - 23 May 24

package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	
	public static void main(String[] args) 
	{


		Configuration config = new Configuration ().configure(); 
		SessionFactory sf= config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student stud =session.get(Student.class,109);
		stud.setMarks(111);    
		session.update(stud);
		tr.commit();
		session.close();
		

	}

}
