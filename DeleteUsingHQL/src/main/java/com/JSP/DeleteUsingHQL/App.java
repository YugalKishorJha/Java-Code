package com.JSP.DeleteUsingHQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(5);
		e.setName("mohit");
		e.setSal(450000);

		Session ss = new Configuration().configure().buildSessionFactory()
				.openSession();
		Transaction tr = ss.beginTransaction();

		Query q= ss.createQuery("delete from Employee e where e.id=2");
		int r= q.executeUpdate();// no of affected records.
		tr.commit();
		System.out.println("records updated");
		ss.close();
	}
}
