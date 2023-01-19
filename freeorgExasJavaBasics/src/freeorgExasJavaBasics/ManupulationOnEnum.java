package freeorgExasJavaBasics;

public class ManupulationOnEnum {

	/* For calling states we always needs to use the Enum name */

	public static void main(String[] args) {
		States s1 = States.COMPLETED;// need to always hold the value of the enum

		for (States s : States.values()/* Here we need to call values method to iterate over the States enum */) {

			if (s == States.PENDING)
				System.out.println("Hi i am pending");
			else if (s == States.PROCESSING)// here the states are static values hence comparison can be done using ==
				System.out.println("Hi i am processing");
			else if (s == States.COMPLETED)
				System.out.println("Hi i am completed");
		}


	}

}
