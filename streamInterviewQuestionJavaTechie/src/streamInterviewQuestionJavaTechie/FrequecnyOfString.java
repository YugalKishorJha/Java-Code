package streamInterviewQuestionJavaTechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequecnyOfString {

	public static void main(String[] args) {
		String s = "aasbfds";
		String[] split = s.split("");
		
//		Map<String, Long> collect = Arrays.stream(split)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		Map<String, Long> collector = Arrays.stream(split)
				.collect(Collectors.groupingBy(cr->cr, Collectors.counting()/*counts the keys present*/));
		System.out.println(collector);
	}
	

}
