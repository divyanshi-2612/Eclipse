//query by criteria restriction example 

package com.main;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class QBCEgRestriction 
{

	public static void main(String[] args) 
	
	{
		
		
Session session = Utility.getSessionFactory().openSession();
		
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Student.class);
		
		
		
		
		//criteria.add(Restrictions.in("batch","Interview Batch","A JAVA"));
		
		criteria.add(Restrictions.like("name","%a"));
		//whose name ends with a
		
		//criteria.add(Restrictions.like("name","%a%"));
		//jiske name ke beech me a aata ho
		
		//criteria.add(Restrictions.like("name","a%"));
		//whose name start with a
		
		//criteria.add(Restrictions.ge("marks",95));
		
		
		List<Student> students=criteria.list();
		for (Student s:students) 
		{
			System.out.println("Name = " +s.getName() );
		}
		
		

	

	}

}
