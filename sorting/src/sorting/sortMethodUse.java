package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.SongComparator;

public class sortMethodUse {

	public static void main(String[] args) {

		/*
		 * Collection sort method only works on list with comparable type list object
		 * and comparator object
		 */

		ArrayList<String> al = new ArrayList<String>();
		al.add("Yugal");
		al.add("Kishor");
		al.add("yugal");
		al.add("jha");
		al.add("Mayank");
		
		System.out.println("Collection before sorting");
		System.out.println(al);
		
		System.out.println("Collection after sorting in asc order....");
		Collections.sort(al);
		System.out.println(al);

		System.out.println("Collection after sorting in desc order....");
		
		Comparator<String> c= new Comparator<String>() {

														@Override
														public int compare(String s1, String s2) {
															return s2.compareTo(s1);
														}
			
			
													   	};
		
	/*	Collections.sort(al, c.reversed());	
	 * reversed() is used for reversing the Comparator
	 * 
	 * 
	 * */					   	
		System.out.println(al);								   
	}

}
