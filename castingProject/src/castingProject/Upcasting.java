package castingProject;


public class Upcasting {

	class A {
		String a = "parent class overshadowed refrence";
		String b = "parent class specific refrence";

		void m1() {
			System.out.println("parent class method ");
		}

		void o() {
			System.out.println("parent class overrided method");
		}

	}

	class B extends A {
		String a = "child class overshadowed refrence";
		String c = "child class specific refrence";
	}

	void m3() {
		System.out.println("child class specific method");
	}

	void o() {
		System.out.println("child class overrided method");
	}

	class MainRunner {
		public static void main(String[] args) {
			Upcasting up = new Upcasting();
			Upcasting.A a1 = up.new B();//Upcasted Object creation in nested classes 
			System.out.println(a1.a);
			System.out.println(a1.b);
			a1.m1();
			a1.o();
			
			/***child specific properties***/
//			a1.m3(); won't able to access using child class specific reference
//			System.out.println(a1.c); wont access child specific properties as well
			
			Upcasting.B b1 = up.new B();//Object creation in nested classes 
			System.out.println(b1.a);
			System.out.println(b1.b);
			System.out.println(b1.c);
			
			b1.m1();
			b1.o();
//			b1.m3();
		}
	}

}
