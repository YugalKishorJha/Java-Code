import java.util.List;
import java.util.stream.Collectors;

public class Limit_Skip_Dropwhile_TakeWhile {

	static boolean filterBySal(Student s) {
		return s.getSal() > 25000 ? true : false;

	}

	public static void main(String[] args) {

		List<Student> ll = List.of(new Student(101, "Mohit", 15000), new Student(102, "Ramesh", 35000),
				new Student(103, "Mahesh", 45000), new Student(104, "Rekha", 10000));

		// limit
		List<Student> students = ll.stream().filter(Limit_Skip_Dropwhile_TakeWhile::filterBySal).limit(2)
				.collect(Collectors.toList());

		// skip
//		ll.stream().filter(Limit_Skip_Dropwhile_TakeWhile::filterByMarks).skip(1).
//		forEach(System.out::println);

		// takeWhile confusion
		ll.stream().takeWhile(s -> s.getSal() <=45000).forEach(System.out::println);
		
		//dropWhile 
//		ll.stream().dropWhile(s -> s.getSal() <= 20000).forEach(System.out::println);


	}
}
