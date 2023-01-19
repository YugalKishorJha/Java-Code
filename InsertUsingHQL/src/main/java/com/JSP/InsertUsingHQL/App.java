package com.JSP.InsertUsingHQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr = ss.beginTransaction();
		Query q = ss
				.createQuery("Insert into Doctor(did,dname,dsal) select e.id,e.name,e.sal from Employee e where id=3");
		q.executeUpdate();
		tr.commit();
		System.out.println("query updated");
		ss.close();
	}
}
