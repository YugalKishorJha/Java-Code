package com.JSP.listMethod;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		Query q = ss.createQuery("Select e from Employee e");
		List ll = q.list();

		for (Object object : ll) {
			Employee e = (Employee) object;
			System.out.println(e.getId() + "," + e.getName() + "," + e.getSal());
		}

		
		
		Query q1 = ss.createQuery("Select e.name,e.sal from Employee e");
		List ll1 = q1.list();// returns the object[] list
		
		Iterator itr1= ll1.iterator();
		while (itr1.hasNext()) {
			 Object[] o=(Object[]) itr1.next();
			System.out.println(o[0]+","+o[1]);
		}
		
		Query q2 = ss.createQuery("Select e.name from Employee e");
		List <String>ll2 = q2.list();
		while (itr1.hasNext()) {
			String n = (String) itr1.next();
			System.out.println(n);
		}
		ss.close();

	}
}
