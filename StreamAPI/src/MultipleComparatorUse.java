import java.util.Comparator;
import java.util.List;

public class MultipleComparatorUse {

	public static void main(String[] args) {

		// sorting first on id and then on names if the id are same 
		List<Student> ll = List.of(new Student(101, "Mohit", 15000), new Student(102, "Ramesh", 35000),
				new Student(101, "Mahesh", 45000), new Student(101, "Rekha", 30000));

		Comparator<Student> c = (s1, s2) -> s1.getId() < s2.getId() ? 0 : -1; //s1.getId()-s2.getId()

		ll.stream().sorted(c.thenComparing((s1, s2) -> s1.getName().compareTo(s2.getName()))).forEach(System.out::println);

		//comparingInt for primitive variable this removes the autoBoxing and autoUnBoxing
		
		
		
		
	}
}
