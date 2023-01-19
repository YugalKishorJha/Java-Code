package singleton;

public class SingletonClass {

	static private SingletonClass singleTon = null;

	public SingletonClass() {

	}

	static SingletonClass getInstance() {
		if (singleTon == null) {
			singleTon = new SingletonClass();
		}
		return singleTon;

	}

	public static void main(String[] args) {
		SingletonClass s1 = getInstance();
		SingletonClass s2= getInstance();
		SingletonClass s3= getInstance();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
