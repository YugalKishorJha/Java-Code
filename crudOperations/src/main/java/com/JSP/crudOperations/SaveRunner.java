package com.JSP.crudOperations;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveRunner 
{
    public static void main( String[] args )
    {
    	Session ss= new Configuration().configure().buildSessionFactory().openSession();
    	Transaction tr=ss.beginTransaction();
    	
    	Student st1=new Student();
    	st1.setId(101);
    	st1.setName("Ramesh");
    	st1.setPerc(75.00);
    	

    	Student st2=new Student();
    	st2.setId(102);
    	st2.setName("Rajesh");
    	st2.setPerc(55.00);
    	
    	
    	Student st3=new Student();
    	st3.setId(103);
    	st3.setName("Mahesh");
    	st3.setPerc(86.00);
    	
    	
    	Student st4=new Student();
    	st4.setId(104);
    	st4.setName("Ram");
    	st4.setPerc(96.00);
    	
    	ss.save(st1);
    	ss.save(st2);
    	ss.save(st3);
    	ss.save(st4);
    	tr.commit();
    	
    	ss.close();
    }
}
