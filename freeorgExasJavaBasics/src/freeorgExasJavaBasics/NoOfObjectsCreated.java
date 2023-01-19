package freeorgExasJavaBasics;

public class NoOfObjectsCreated {
	static Test t3;//to make the variable global
	
	public static void main(String[] args) {

		Test t = new Test();
		Test t1 = new Test();
		Test t2 = new Test();
		
		
		for (int i = 0; i <4; i++) {
			 t3= new Test();// it is local variable
		}
		
		System.out.println(Test.getCreationTestCounter());

	}

}
