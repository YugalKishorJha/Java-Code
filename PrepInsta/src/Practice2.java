import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

	static int a[] = { 4, 5, 1, 7, 2, 47, 8 };

	private static String ascendingSort() {

		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		String s1 = Arrays.toString(a);
		return s1;
	}

	private static String decendingSort() {

		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		String s2 = Arrays.toString(a);
		return s2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();

		String result[] = { ascendingSort(), decendingSort() };
		System.out.println(result[x]);

	}

}
