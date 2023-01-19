
public class Student implements Comparable<Student> {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return this.id + "<->" + this.name;
	}

	public boolean equals(Object o) {
		return ((Student) (o)).id == this.id;
	}

	public int hashCode() {
		return ((Integer) (this.id)).hashCode();
	}

	@Override
	public int compareTo(Student s) {
		return this.id-s.id;
	}

	

}
