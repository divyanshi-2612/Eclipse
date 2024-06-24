
// 23 may 24 read data by HQL 


package com.main;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;



public class HQLReadEg {

	public static void main(String[] args)
	
	{
		Session session = Utility.getSessionFactory().openSession();
		String sql="FROM Student";
		
		//String sql = "FROM Student where batch='Interview' ";
		
		//String sql = "FROM Student where batch='Interview' and marks>900 ";
		
		//String sql = "FROM Student where batch='Interview' and marks>900 order by marks desc ";
		
		
		
		// to run HQL we create QUERY object
		
		Query <Student> query = session.createQuery(sql);
		List <Student> stud = query.list();
		for (Student s: stud)
		{
			System.out.println(s);
		}
		session.close();
		
	}

}
