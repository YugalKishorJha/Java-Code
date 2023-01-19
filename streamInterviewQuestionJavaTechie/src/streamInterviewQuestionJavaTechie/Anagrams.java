package streamInterviewQuestionJavaTechie;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "aeiou";
		String s2 = "uioea";
		Map<String, Long> collect1 = Arrays.stream(s1.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<String, Long> collect2 = Arrays.stream(s2.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		if (collect1.equals(collect2))
			System.out.println("The string is Anagram");
		else
			System.out.println("The string is not a Anagram");
	}
}
