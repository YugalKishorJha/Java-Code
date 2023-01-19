package nativeSQL;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.JSP.InsertUsingHQL.Employee;

public class SelectUsingNativeSQL {

	public static void main(String[] args) {

		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		SQLQuery s = ss.createSQLQuery(
				"select * from Employee");/* .addEntity(Employee.class); for converting it to the Employee list */
		// to convert the list of object[] into Employee object list
		// then we need to iterate over the Employee obj

		List<Object[]> lk = s.list();// this will return object array not employee object list

		for (Object[] obj : lk) {
			for (Object ob : obj) {
				System.out.print(ob + " ");// taking each object then and printing the values
			}
			System.out.println();
		}

	}

}
