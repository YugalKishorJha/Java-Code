package streamInterviewQuestionJavaTechie;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonUniqueElements {

	public static void main(String[] args) {
		int ar[] = { 1, 1, 2, 2, 2, 3 };// {1,2}
		Set<Integer> hs = new HashSet<>();

		Integer[] array = Arrays.stream(ar).boxed().toArray(Integer[]::new);
		Set<Integer> collect = Stream.of(array).filter(x -> !hs.add(x)).collect(Collectors.toSet());
		System.out.println(collect);

		// second method
		Stream.of(array).filter(i -> Collections.frequency(Arrays.asList(array), i) > 1).collect(Collectors.toSet())
				.forEach(System.out::println);
	}

}
