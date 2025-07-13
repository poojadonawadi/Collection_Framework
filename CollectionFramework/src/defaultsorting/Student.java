package defaultsorting;

public class Student implements Comparable<Student> {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Id :"+id+"  Name :"+name;
	}

	@Override
	public int compareTo(Student s) {
		// return this.id - s.id; => sort based on id
		return this.name.compareTo(s.name); // sort based on name

	}

}

/* decending order
   return s.name.compareTo(this.name);
 */