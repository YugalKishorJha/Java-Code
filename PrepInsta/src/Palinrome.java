public class Palinrome {
	public static void main(String[] args) {

		String st = "madam";
		String rev = "";
		StringBuilder s = new StringBuilder();
		StringBuilder s1 = s.reverse();
		System.out.println(s.toString() + " " + s1);

		if ((s1.compareTo(s)) == 0)// compareTo method of comparable type
			System.out.println("the word is a palindrome");
		/* not working */

		for (int i = st.length() - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}

		// we can use both comapreTo as well as equals method because in the string
		// class the methods are override to compare content

		if (st.equals(rev))
			System.out.println("the word is a palindrome");

		if (st.compareTo(rev) == 0)
			System.out.println("the word is a palindrome");

		/* not understood */
		if (st.equals(new StringBuilder(st).reverse().toString().trim()))
			System.out.println("the word is a palindrome");
	}

}
