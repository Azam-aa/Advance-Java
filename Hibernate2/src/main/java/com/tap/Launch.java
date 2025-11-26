package com.tap;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Launch {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(CustomerDetails.class);
		cfg.addAnnotatedClass(Orders.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		
	 	Orders noodles=new Orders(501,"Noodles",150, null);
	 	Orders biryani=new Orders(502,"biryani",250, null);
	 	Orders gobi=new Orders(503,"gobi",75, null);
	 	
	 	Customer tim = session.get(Customer.class, 1);
	 	noodles.setCust(tim);
	 	biryani.setCust(tim);
	 	gobi.setCust(tim);
	 	
	 	
	 	session.save(noodles);
	 	session.save(biryani);
	 	session.save(gobi);
	 	
	 	
		
		
		
		
		
		

//		CustomerDetails custDetails=session.get(CustomerDetails.class, 101);
//		Customer c=custDetails.getCustomer();
//		System.out.println(custDetails);
//		System.out.println(c);   Display from CustomerDetails to customer relation
		
		
		
//		Customer c = session.get(Customer.class, 2);
//		 CustomerDetails custDetails =c.getCid();
//		 System.out.println(c);
//		 System.out.print(custDetails);  DISPLAY
		
		
		
//		Customer c=new Customer(3,"sam");
//		CustomerDetails cid=new CustomerDetails(103,"sam@gmail.com", 787787878,"usa");
//		c.setCid(cid);
//		session.save(c);    INSERT
		
		tr.commit();
		
	}
 
}
