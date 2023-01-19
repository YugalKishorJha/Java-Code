import java.util.Scanner;

public class GetASCIIValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give the input character");
		char ch = sc.next().charAt(0);

		int i = ch;
		System.out.println("The ASCII value of the character " + ch + " is " + i);
	}

}
