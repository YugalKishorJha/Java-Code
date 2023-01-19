package streamInterviewQuestionJavaTechie;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheThridLargestElementInListBrillo {

	public static void main(String[] args) {

		List<Integer> ll = List.of(10, 20, 3, 0, 4, 2, 0, 4, 20, 2, 5);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();

		ll.stream().sorted(Comparator.reverseOrder()).forEach(lhs::add);
		// dont know why foreach loop is taking boolean valued implementaion
		Consumer<Integer> c = lhs1::add; /* sim (s)->lhs1.add(s) */

		System.out.println(lhs);

		Integer thirdHighest = lhs.stream().collect(Collectors.toList()).get(2);
		System.out.println(thirdHighest);

		// other way or best way
		Integer thirdHighest2 = ll.stream().sorted(Comparator.reverseOrder()).distinct()
				.skip(2).limit(1).findFirst().get();
		System.out.println(thirdHighest2);

	}

}
