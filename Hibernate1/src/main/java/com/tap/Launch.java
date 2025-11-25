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
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sess=cfg.buildSessionFactory();
		Session session=sess.openSession();
		Transaction tr = session.beginTransaction();
		
//		Query q = session.createQuery("Delete from Employee e where e.department='IT'");
//		int n = q.executeUpdate();	
//		System.out.print(n);   For "Deleting" the department
		
		
//		Query q=session.createQuery("Update Employee e set e.salary=e.salary+10000"
//				+ " where e.salary>=100000");
//		int n = q.executeUpdate();	
//		System.out.print(n);     For "Updating the salary"
		
		
//		Query q=session.createQuery("from Employee e");
//		List l = q.getResultList();
//		for(Object o:l) {
//			System.out.println(o);
//		}    DISPLAY (select * from employee)
		
		
//		Employee e=session.get(Employee.class, 2);
		
		
//		session.delete(e);  For "deleting"
		
		
//		e.setSalary(100000);
//		session.update(e);  To "update"
		
		
//		Employee e=session.get(Employee.class, 2);
//		System.out.println(e);  "Display" To get the ID (only single row)
		

		
//		Employee e1=new Employee(5,"parvathi","parvathi@gmail.com","IT",200000);
//		session.save(e1); // For "Insert" data in DATABSE
		
		
		
		tr.commit();
		
	}
 
}
