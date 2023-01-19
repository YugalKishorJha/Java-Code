import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
	public static void main(String[] args) {
		List<Student> ll2 = List.of(new Student(102, "Rekha", 40000), new Student(103, "yugal", 74000),
				new Student(104, "Rakesh", 15000), new Student(105, "Rekha", 36000));
// grouping based on names

//		Map<String, List<Student>> collection = ll2.stream().collect(Collectors.groupingBy(s -> s.getName()));
		Map<String, List<Student>> collection2 = ll2.stream().collect(Collectors.groupingBy(Student::getName));
		System.out.println(collection2);

		// grouping based on string
		String s = "yugal yugal kishor jha";
		String str = "aabcc"; // for splitting this use str.split("");
		String[] split = s.split(" ");

		Map<String, Integer> mm = new HashMap<>();

		for (int i = 0; i < split.length; i++) {
			if (mm.containsKey(split[i]))
				mm.put(split[i], mm.get(split[i]) + 1);
			else
				mm.put(split[i], 1);
		}
		System.out.println(mm);

		System.out.println(Arrays.stream(split).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

	}

}
