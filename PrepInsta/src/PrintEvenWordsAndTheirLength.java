
public class PrintEvenWordsAndTheirLength {

	public static void main(String[] args) {

		String s = "i am yugal and this is my world";

		String st[] = s.split(" ");

		for (int i = 0; i < st.length; i++) {
			if (st[i].length() % 2 == 0)
				System.out.println(st[i] + " => " + st[i].length());
		}

	}

}
