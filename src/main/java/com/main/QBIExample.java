package com.main;

import org.hibernate.Session;

public class QBIExample {

	public static void main(String[] args) 
	{
	
		
		
		Session session = Utility.getSessionFactory().openSession();
		Student stud =session.get(Student.class,119);
		System.out.println(stud);
		session.close();
		
		String name=stud.getName();
		System.out.println(name);
		
		
	}

}
