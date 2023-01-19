package freeorgExasJavaBasics;

public class Name {
	String firstname;
	String middlename;
	String lastname;
	
	public Name(String firstname, String middlename, String lastname) {
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Name [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + "]";
	}
	
	
}
