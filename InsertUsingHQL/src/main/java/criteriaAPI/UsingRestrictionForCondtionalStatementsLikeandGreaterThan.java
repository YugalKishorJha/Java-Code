package criteriaAPI;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.JSP.InsertUsingHQL.Employee;

public class UsingRestrictionForCondtionalStatementsLikeandGreaterThan {

	public static void main(String[] args) {

		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		Criteria c = ss.createCriteria(Employee.class);
		// Criterion cr = Restrictions.ge("sal", 150000.00);// gives classCast Exception
		// for the sal usually

		// Criterion cr1 = Restrictions.like("name", "%m%");// using regular expression
		// for 2nd parameter

		/* For making order */
		// Ascending Order NO need passing the criterion object
		/*
		 * passing Order object in to criteria object for ordering by using the
		 * addOrder()
		 * 
		 */

		// c.addOrder(Order.asc("sal"));
		// For Descending order
		// c.addOrder(Order.desc("sal"));// we caN combine Order and criterion

		/*
		 * //For greater than and ascending order Criterion crtm =
		 * Restrictions.ge("sal", 150000.00); c.add(crtm); c.addOrder(Order.asc("sal"));
		 */

		// c.add(cr1);// to add the multiple restriction can be added by making more
		// Criterion object using the condition and add to criteria object

		/* Adding multiple restriction by using OR & And () */
		Criterion ck = Restrictions.ge("sal", 150000.00);// usual mistake
		Criterion ck1 = Restrictions.like("name", "%m%");

		Criterion ci = Restrictions.and(ck, ck1);
		c.add(ci);

		List<Employee> e = c.list();
		Iterator<Employee> i = e.iterator();
		while (i.hasNext()) {
			Employee e1 = i.next();
			System.out.println(e1.getId() + "," + e1.getName() + "," + e1.getSal());
		}

	}

}
