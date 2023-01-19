package casting;

public class Prac1 {
	public static void main(String[] args) {
		int a = -2;int b = 6;int c = 9;
		int big = a;int counter = 1;

		if (b > a) {
			big = b;
			counter++;
		} else if (c > a) {
			big = c;
			counter++;
			counter++;
		}

		switch (counter) {
		case 0:
			System.out.println("a is the biggest number");
			break;
		case 1:
			System.out.println("b is the biggest number");
			break;
		case 2:
			System.out.println("c is the biggest number");
		}

	}

}
