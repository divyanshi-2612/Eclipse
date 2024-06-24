//23 MAy 24 how to run sql command using hibernate 

package com.main;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;


public class SQLusingHIBERNTE {

	public static void main(String[] args) {
		Session session = Utility.getSessionFactory().openSession();
		//stu is the table name in database 
		SQLQuery  query = session.createSQLQuery ("select * from stu");
		List <Object[]> o = query.list();
		for (Object[] o1 : o)
		{
			for (Object o2 : o1)
			{
				System.out.print(o2+" ");
			}
			System.out.println();
		}
		

	}

}
