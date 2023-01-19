package com.JSP.crudOperations;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRunner {

	public static void main(String[] args) {
		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr= ss.beginTransaction();
		
	Student s=	ss.load(Student.class, 101);
		ss.delete(s);
		tr.commit(); // mistake forgot to commit the deletion does'nt reflect in db
		ss.close();
	}

}
