package com.main;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection; 
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionOneEg {

	public static void main(String[] args) 
	{
		Session session = Utility.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Student.class);
		
		Projection pro1 = Projections.property("name"); 
		//criteria.setProjection  (pro1);)
		
		 Projection pro2 = Projections.property("marks");
		// criteria.setProjection (pro2);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(pro1);
		plist.add(pro2); 
		
		criteria.setProjection(plist);
		
		List<Object[]> data = criteria.list();
		
	   for (Object[] o : data)
	  {
		   for (Object o1 :o )
		   {
			   
		   System.out.print(o1.toString()+" ");
		   }
		   System.out.println();
	   }
		
	}

}
