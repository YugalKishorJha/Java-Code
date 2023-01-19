package freeorgExasJavaBasics;

public class Person {
	private static Name personname;
	private Address add;

	public Name getPersonname() {
		return personname;
	}

	public void setPersonname(Name personname) {
		// this.personname = personname; this should'nt be used with the static context
		freeorgExasJavaBasics.Person.personname = personname;// can use with the package name if using
																// from diffrent package then no need to import
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public static void main(String[] args) {

		Person p = new Person();
		Person p1 = new Person();
		

		/* this cannot be used in the static context */

		p.setPersonname(new Name("Yugal", "Kishor", "jha"));
		p1.setPersonname(new Name("Piyush", "Kumar", "Thakur"));
		

		System.out.println(p.getPersonname());// static maintains one copy 
		System.out.println(p1.getPersonname());// static maintains one copy 
		
		p.setAdd(new Address("D", 25, 5));
		p1.setAdd(new Address("F", 25, 3));
		
		System.out.println(p.getAdd());// non static is object dependent 
		System.out.println(p1.getAdd());// non static is object dependent
		
	}

}
