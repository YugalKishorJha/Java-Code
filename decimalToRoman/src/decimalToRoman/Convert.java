package decimalToRoman;

public class Convert {

	public static void main(String[] args) {
		int decimal[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String roman[] = { "M", "CM", "D", "CD", "C", "IC", "L", "XL", "X", "IX", "V", "IV", "I" };

		int num = 27, temp = 27 ;

		String ans = "";

		for (int i = 0; i < decimal.length; i++) {
			while (decimal[i] <= temp) {
				temp -= decimal[i];
				ans += roman[i];
			}
		}
		System.out.println("The " + num + " equivalent roman number is " + ans);

	}

}
