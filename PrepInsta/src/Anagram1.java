import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		String s1 = "mother in law";
		String s2 = "hitler woman";

		char ch1[] = new char[128];
		char ch2[] = new char[128];

		for (int i = 0; i < s1.length(); i++) {
			ch1[s1.charAt(i)]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			ch2[s2.charAt(i)]++;
		}

		for (int i = 0; i < 128; i++) {
			if (ch1[i] != ch2[i]&&i!=32) {
				System.out.println("The strings are not anagram");
				return;
			}
		}
		System.out.println("The strings are an anagram");

		/*
		 * if (Arrays.equals(ch1, ch2))
		 * System.out.println("The strings are an anagram"); else
		 * System.out.println("The strings are not  an anagram");
		 */

	}

}
