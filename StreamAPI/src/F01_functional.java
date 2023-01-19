import java.util.List;

public class F01_functional {
	// stream is paradigm shift hence moving from how(Imperative) to what
	// (Functional)

	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 58, 24, 6, 4, 5, 4, 65);

		printNo(numbers);

	}

	public static void printStreamElement(int x) {
		System.out.println(x);
	}

	public static boolean printEven(int x) {
		return x % 2 == 0;
	}

	private static void printNo(List<Integer> numbers) {

		numbers.stream()// converts the list in to single elements
				.forEach(F01_functional::printStreamElement);// for each elements performs the i/p function on each
																// element

		numbers.stream().forEach(System.out::println);
		numbers.stream().filter(F01_functional::printEven).forEach(System.out::println);// In this method we do not
																						// use()

		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);// here int in lambda expression 
																				//is automatically known as int 
																				//because of list generic
	
		
	}

}
