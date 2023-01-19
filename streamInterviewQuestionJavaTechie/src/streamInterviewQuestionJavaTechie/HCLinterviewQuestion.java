package streamInterviewQuestionJavaTechie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HCLinterviewQuestion {

	public static void main(String[] args) {

		// second highest number
		Integer collect = Stream.of(1, 5, 3, 1, 54, 6, 2).sorted(Comparator.reverseOrder()).
				distinct().limit(2).skip(1).findFirst().get();
		System.out.println(collect);

		List<Employee> ll = List.of(new Employee(101, "yugal", "IT", 50000), new Employee(102, "Mohit", "IT", 75000),
				new Employee(101, "Sankalp", "Bussiness", 40000), new Employee(101, "Charu", "Bussiness", 40000),
				new Employee(101, "Khushboo", "Support", 35000), new Employee(101, "Abhishek", "Support", 35000),
				new Employee(101, "Pawan", "Security", 63000), new Employee(101, "Naresh", "Security", 80000));

		// map the employees names with their department
		ll.stream().collect(Collectors.toMap(Employee::getName, Employee::getDept)).
		forEach((x,y)->System.out.println(x+"->"+y));
		
		
		//count no of peoples in dept
		ll.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting())).
		forEach((x,y)->System.out.println(x+"->"+y));
		
	}

}
