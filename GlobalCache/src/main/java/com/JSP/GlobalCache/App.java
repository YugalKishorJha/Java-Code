package com.JSP.GlobalCache;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {

		Session ss = new Configuration().configure().buildSessionFactory().openSession();

	}
}
