import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class GroupingByAdvance {
	public static void main(String[] args) {
		
		List<Employee> employeeList = List.of(new Employee(101, "Ramesh", "IT", 45000),
				new Employee(105, "Mikhail", "IT", 71000),
				new Employee(108, "Akhil", "Buisness", 95000),
				new Employee(103, "Amrish", "Buisness", 95000),
				new Employee(102, "Rupa", "Service", 35000),
				new Employee(104, "Lipsa", "Service", 45000));
				
		// to group employee based on dept
		
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDept))
		.forEach((key,value)->System.out.println(key+" <-> "+value));
		
		// to count people based on dept
		
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
		.forEach((key,value)->System.out.println(key+" <-> "+value));

		// find the max sal employee based on dept 
		
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,
		Collectors.maxBy(Comparator.comparing(Employee::getSal))))
		.forEach((key,value)->System.out.println(key+" <-> "+value));

		// map the number of people in each dept 
		
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,
		Collectors.mapping(Employee::getName,Collectors.toList())))
		.forEach((key,value)->System.out.println(key+" <-> "+value));
		
		
	}

}
