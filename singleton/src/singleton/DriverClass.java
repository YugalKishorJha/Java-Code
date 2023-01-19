package singleton;

public class DriverClass {

	public static void main(String[] args) {

		CustomSingleTon c1 = CustomSingleTon.getCustomSingleTon();
		CustomSingleTon c2 = CustomSingleTon.getCustomSingleTon();

// c1 and c2 will have same address

		/*
		 * Connection in the JDBC is exa of Singleton class 
		 * Anonymous class is exa of Singleton class
		 * 
		 */

	}

}
