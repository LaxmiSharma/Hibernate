package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee();
		employee.setId(1001);
		employee.setFirstName("Laxmi 2");
		employee.setLastName("Sharma");
		
		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setFirstName("vimal");
		e2.setLastName("jaiswal");

		session.persist(employee);
		session.persist(e2);
		transaction.commit();
		session.close();
		System.out.println("successfully saved");

	}
}
