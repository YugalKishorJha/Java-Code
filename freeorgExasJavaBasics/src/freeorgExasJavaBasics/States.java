package freeorgExasJavaBasics;

/******
 * It is similar to the class only difference is that it can have values that
 * can be iterated over like array
 *******/

/** can be defined inside a class as well **/

public enum States {
	PENDING, PROCESSING, COMPLETED;
	

	States() {
		/** Constructors can be default or private **/
		System.out.println("hi");
	}
	
	 void check(){
		 /** No sim rule like Constructors in method **/
		System.out.println("bye");
	}
	 
	

}
