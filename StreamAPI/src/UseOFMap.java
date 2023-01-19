import java.util.List;

public class UseOFMap {

	public static void main(String[] args) {
		List<Integer> ll = List.of(1, 2, 3, 4, 5);
		printSquaresOfEvenNumbers(ll);

	}

	private static void printSquaresOfEvenNumbers(List<Integer> ll) {
		ll.stream().filter(x -> x % 2 == 0).map(x -> x = x * x).forEach(System.out::println);
	}

}
