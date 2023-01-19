package streamInterviewQuestionJavaTechie;
 import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestInArray {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 4, 2, 65 };
//		Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new/*This is constructor ref*/);
		// used to box the primitive type of array

//		Stream.of(boxedArr).collect(Collectors.toSet());
		// convert to set

		Integer[] array = Arrays.stream(ar).boxed().toArray(Integer[]::new);
		Set<Integer> collect = Stream.of(array).collect(Collectors.toSet());
		List<Integer> collect2 = collect.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
		Integer secondHighestElement = collect2.get(1);
		
		// better way
		Integer collect3 = collect.stream().sorted((x, y) -> y - x).
				distinct().limit(2).skip(1).findFirst().get();
		
		System.out.println("Second highest element in the array is " + secondHighestElement);
		System.out.println("Second highest element in the array is " + collect3);
	}

}
