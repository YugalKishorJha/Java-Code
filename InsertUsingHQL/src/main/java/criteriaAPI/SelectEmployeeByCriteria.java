package criteriaAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.JSP.InsertUsingHQL.Employee;

public class SelectEmployeeByCriteria {

	public static void main(String[] args) {

		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		Criteria cr = ss.createCriteria(Employee.class);

		/*
		 * for projections we have to use projection object
		 * 
		 * Projection p= Projections.property("id"); cr.setProjection(p);
		 * 
		 * List<Integer> l= cr.list(); for (Integer integer : l) {
		 * System.out.println(integer); }
		 * 
		 */

		/* for multiple Projection */ 
		/* for more than one projection of projection object doesnt work we need to create the projectionlist object*/
		
		ProjectionList pl= Projections.projectionList();
		
		Projection p1= Projections.property("id");
		Projection p2= Projections.property("name");
		
		pl.add(p1);
		pl.add(p2);
		cr.setProjection(pl);
		
		List<Object[]> ll=cr.list();
		
		for (Object[] objects : ll) {
			System.out.println(objects[0]+","+objects[1]);
		}
		
		
	}

}
