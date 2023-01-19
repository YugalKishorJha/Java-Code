import java.util.Comparator;
import java.util.List;

public class UseOfDistinctAndSorted {

	public static void main(String[] args) {

		List<Integer> ll = List.of(10, 5, 6, 4, 6, 1, 4);
		List<String> ll1 = List.of("yugal", "harsha", "sanjay", "shivam", "mahesh", "sanjit", "abhijeet", "zathura");

//		ll.stream().distinct().forEach(System.out::println);
//		ll1.stream().sorted().forEach(System.out::println);

		// Reversing the list
//		ll1.stream().sorted((a,b)->a.charAt(0)>b.charAt(0)?0:-1).forEach(System.out::println);
		// passing the custom comparator
		//ll1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// sorting based on length (ascending)
		//comparator takes two input
//		ll1.stream().sorted((a, b) -> a.length() > b.length() ? 0 : -1).forEach(System.out::println);
//		ll1.stream().sorted(Comparator.comparing((str) -> str.length())).forEach(System.out::println);

	}

}
