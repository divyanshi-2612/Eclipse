// 22 May 24 Group and Aggregation Example by Mapping 


package com.main;

import java.util.List;

import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections; 
import org.hibernate.transform.Transformers;

public class GrpAndAggrEg 
{

	public static void main(String[] args) 
	
	{
		Session session = Utility.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Student.class);
		
		Projection pro1 = Projections.groupProperty("batch");
		Projection pro2 = Projections.sum("marks");
		Projection pro3 = Projections.min("marks");
		Projection pro4 = Projections.max("marks");
		Projection pro5 = Projections.avg("marks");
		Projection pro6 = Projections.count("marks");
		
		ProjectionList plist =Projections.projectionList();
		plist.add(pro1,"batch");
		plist.add(pro2,"sum");
		plist.add(pro3,"min");
		plist.add(pro4,"max");
		plist.add(pro5,"avg");
		plist.add(pro6,"count");
		
		
		criteria.setProjection(plist);
		criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		List<Map> list = criteria.list();
		
		   for (Map m : list)
		  {
			   
			   System.out.println(m);
		   }
		   session.close(); 

	
		
		
	}

}
