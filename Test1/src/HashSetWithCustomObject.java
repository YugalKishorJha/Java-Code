import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class HashSetWithCustomObject {
	public static void main(String[] args) {

		HashSet<Student> hs = new HashSet<>();

		hs.add(new Student(101, "Mahesh"));
		hs.add(new Student(101, "Mahesh"));
		hs.add(new Student(106, "Rahmesh"));
		hs.add(new Student(109, "Manesh"));
		hs.add(new Student(103, "Rakesh"));
//		System.out.println(hs);

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "Mahesh"));
		al.add(new Student(101, "Mahesh"));
		al.add(new Student(106, "Rahmesh"));
		al.add(new Student(109, "Manesh"));
		al.add(new Student(103, "Rakesh"));

		Collections.sort(al);
		System.out.println(al);

		Comparator<Student> cs = (s1, s2) -> (s1.name).compareToIgnoreCase(s2.name);
		Collections.sort(al, cs);
		System.out.println(al);
	}

}
