//21may24 query by criteria projection by map example 

package com.main;

import java.util.List;


import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

public class ProjectionMapEg 
{

	public static void main(String[] args) 
	{
		Session session = Utility.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Student.class);
		Projection pro1 = Projections.property("name"); 
		//criteria.setProjection  (pro1);
		
		 Projection pro2 = Projections.property("marks");
		// criteria.setProjection (pro2);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(pro1,"StName");
		plist.add(pro2,"StMarks"); 
		
		criteria.setProjection(plist);
		criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		
		List<Map> data = criteria.list();
		
		   for (Map m : data)
		  {
			   
			   System.out.println(m);
		   }

	}

}
