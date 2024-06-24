//22 may 24 grouping and aggregation projection by bean example 


package com.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

public class GrpAndAggBeanEg {

	public static void main(String[] args) {


		
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
		criteria.setResultTransformer(Transformers.aliasToBean(Summary.class));
		
		List<Summary> list = criteria.list();
		
		   for (Summary s : list)
		  {
			   
			   System.out.println(s);
		   }
		   session.close(); 


	}

}
