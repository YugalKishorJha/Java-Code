package freeorgExasJavaBasics;

public class Test {

	private static int creationTestCounter;// one copy does'nt need to depend on the on object craetion

	Test() {
		creationTestCounter++;
	}

	static int getCreationTestCounter() {// Declared this method because the field is private and to
		// access it we need getter method

		return creationTestCounter;
	}

	// if we are using a static varaible inside a method then it is good practice to
	// make the method static as well

}
