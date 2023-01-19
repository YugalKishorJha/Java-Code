import java.util.Scanner;
public class InputCharacterIsAlphabet {

	static char c = 'a';

	public static void main(String[] args) {

		boolean rs = checkAlphabet(c);
		if(rs)
			System.out.println("the input is a character");
		else
			System.out.println("the input is not a character");
	}

	private static boolean checkAlphabet(char c) {
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			return true;
		else
			return false;
	}
}
