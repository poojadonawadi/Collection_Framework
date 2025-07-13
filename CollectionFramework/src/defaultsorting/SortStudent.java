package defaultsorting;

import java.util.TreeSet;

public class SortStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(300, "B");
		Student s2 = new Student(104, "D");
		Student s3 = new Student(201, "T");
		
		TreeSet<Student> t = new TreeSet<Student>();
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student s : t) {
			System.out.println(s);
		}
		
	}

}
