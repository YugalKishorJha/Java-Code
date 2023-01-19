package streamInterviewQuestionJavaTechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "aanbcn";

		String[] split = str.split("");
		
		List<String> collect = Arrays.stream(split).filter(x -> Collections.
				frequency(Arrays.asList(split), x) == 1)
				.collect(Collectors.toList());
		
			if(collect.isEmpty())
			System.out.println("There is no non repeated character");
			else
			System.out.println(collect.get(0) + " is the first non repeated character");

			//better
			String string = Arrays.stream(split).filter(x -> Collections.
					frequency(Arrays.asList(split), x) == 1).limit(1).findFirst().get();
			
			System.out.println(string+ " is the first non repeated character");
			
	}

}
