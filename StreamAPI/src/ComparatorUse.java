import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorUse {

	public static void main(String[] args) {
// sorting based on names
			List<Student> ll = List.of(new Student(101, "Mohit", 15000), new Student(102, "Ramesh", 35000),
					new Student(101, "Mahesh", 45000), new Student(101, "Rekha", 30000));

//		ll.stream().sorted((s1, s2) -> s1.getId() > s2.getId() ? 0 : -1).forEach(System.out::println);
			
//	    List<Student> list = ll.stream().sorted(Comparator.comparing(Student::getName)).
//			collect(Collectors.toList());
	
	List<Student> list2 = ll.stream().sorted((s1, s2) -> s1.getName().
			compareTo(s2.getName())).collect(Collectors.toList());

		System.out.println(list2);
	}

}