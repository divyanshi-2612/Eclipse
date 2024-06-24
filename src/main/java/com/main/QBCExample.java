//query by criteria oredering example


package com.main;





import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class QBCExample {

	
	public static void main(String[] args) 
	{

		Session session = Utility.getSessionFactory().openSession();
		
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Student.class);
		
		
		criteria.addOrder(Order.desc("marks"));
		//select * from Student order by marks desc
		
		criteria.addOrder(Order.asc("name"));
		//select * from Student order by name asc
		
		
		List<Student> students=criteria.list();
		for (Student s:students) 
		{
			System.out.println(s);
		}
		
		

	}

}
