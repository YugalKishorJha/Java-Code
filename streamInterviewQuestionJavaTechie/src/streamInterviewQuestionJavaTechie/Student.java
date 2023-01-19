package streamInterviewQuestionJavaTechie;

public class Student {

	int id;
	String name;
	int sal;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public Student(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

}
