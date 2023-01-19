package singleton;

public class DoubleLockChecking {

	private static DoubleLockChecking d;

	private DoubleLockChecking() {

	}

	/***
	 * Same thing works if we make method as synchronized but it will check even the
	 * d is initialized and drops performance
	 * 
	 * hence when need to initialize the d we will synchronized but later we will
	 * simply return d
	 * 
	 */

	static DoubleLockChecking getInstance() {
		if (d == null) {
			synchronized (DoubleLockChecking.class) {
				if (d == null)
					d = new DoubleLockChecking();
			}
		}
		return d;
	}

	public static void main(String[] args) {
		DoubleLockChecking s1 = getInstance();
		DoubleLockChecking s2 = getInstance();
		DoubleLockChecking s3 = getInstance();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
