package criteriaAPI;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.JSP.InsertUsingHQL.Employee;

public class FullObjectRetrival {

	public static void main(String[] args) {

		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		Criteria c = ss.createCriteria(Employee.class);

		List l = c.list();
		Iterator<Employee> i = l.iterator();
		while (i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.getId() + "," + e.getName() + "," + e.getSal());
		}
		ss.close();
	}

}
