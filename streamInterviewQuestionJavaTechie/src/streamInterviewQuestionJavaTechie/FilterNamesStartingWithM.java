package streamInterviewQuestionJavaTechie;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNamesStartingWithM {

	public static void main(String[] args) {
		List<Student> ll = List.of(new Student(101, "Mohit", 15000), new Student(102, "Ramesh", 35000),
				new Student(101, "Mahesh", 45000), new Student(101, "Rekha", 30000));

		
		List<String> collectionOfStudentsNameWithM = ll.stream().map(s->s.name).
				filter((s)->s.startsWith("M")).
				collect(Collectors.toList());
		
		System.out.println(collectionOfStudentsNameWithM);
	}

}
