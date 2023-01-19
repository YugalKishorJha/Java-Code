package NamedQuery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.JSP.DeleteUsingHQL.Employee;

public class MainRunnerforNativeQuery {
	public static void main(String[] args) {
		

		Session ss = new Configuration().configure().buildSessionFactory()
				.openSession();

		Query q= ss.getNamedQuery("q1");
		q.setParameter(0, 5);
		List<Employee> ll1= q.list();
		
		for (Employee emp : ll1) {
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
		}
		
		
		
		
		
		/*
		 * Query q= ss.getNamedQuery("q2"); q.setParameter(0, 5); List<Employee> ll1=
		 * q.list();
		 */
}}
