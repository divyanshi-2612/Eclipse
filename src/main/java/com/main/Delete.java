//Task delete data  in hibernate using delete or remove method - 23 May 24

package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) 
	{


		Configuration config = new Configuration ().configure(); 
		SessionFactory sf= config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student stud =session.get(Student.class,103);
		//session.delete(stud);
		session.remove(stud);
		tr.commit();
		session.close();

	}

}
