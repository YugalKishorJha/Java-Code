import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise01 {

	public static void main(String[] args) {
		List<String> ll = List.of("spring boot", "spring", "java", "j2ee", "java spring");
		List<Integer> ll1 = List.of(1, 2, 3);

//		printWordContaningString(ll);
//		printWordWhichHasAtleast5Letter(ll);
//		printNoOfWordsOfEachWords(ll);
//		System.out.println(sumOfSquare(ll1));
//		System.out.println(sumofOddNumber(ll1));
		System.out.println(printNewListOfLength(ll));
		
		List<Student> ll2=List.of(new Student(102,"Rekha",40000),new Student(103,"yugal",74000),
				new Student(104,"Rakesh",15000),new Student(105,"Ramesh",36000));
		
		ll2.stream().filter(s->s.getSal()>20000).forEach(System.out::println);
		

	}

	private static List<Integer> printNewListOfLength(List<String> ll) {
		return ll.stream().map(x -> x.length()).collect(Collectors.toList());
	}

	private static int sumofOddNumber(List<Integer> ll1) {
		return ll1.stream().filter((x) -> x % 2 != 0).reduce(0, (a, b) -> a + b);

	}

	private static void printNoOfWordsOfEachWords(List<String> ll) {
		ll.stream().map(x -> x.length()).forEach(System.out::println);
	}

	private static void printWordWhichHasAtleast5Letter(List<String> ll) {
		ll.stream().filter((x) -> x.length() >= 5).forEach(System.out::println);
	}

	private static void printWordContaningSpring(List<String> ll) {
		ll.stream().filter((x) -> x.contains("spring")).forEach(System.out::println);
	}

	private static int sumOfSquare(List<Integer> ll) {
		return ll.stream().map(x -> x * x).reduce(0, (a, b) -> a + b);
	}

	
}
