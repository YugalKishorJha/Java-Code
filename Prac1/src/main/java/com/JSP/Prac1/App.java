package com.JSP.Prac1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(4);
		e.setName("mohit");
		e.setSal(450000);

		Session ss = new Configuration().configure().buildSessionFactory()
				.openSession();
		Transaction tr = ss.beginTransaction();

		ss.save(e);
		tr.commit();
		ss.close();
		
		System.out.println("records updated");

	}
}
