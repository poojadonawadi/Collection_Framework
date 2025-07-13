package customsorting;

import java.util.TreeSet;

public class SortStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(22, "Tom");
		Student s2 = new Student(21, "Jerry");
		Student s3 = new Student(24, "Dora");
		
		/* if we want sort by name we need to pass the reference of age class*/
		SortStudentsByAge age = new SortStudentsByAge();
		
		//TreeSet<Student> t = new TreeSet<Student>(age);
		
		SortStudentsByName name = new SortStudentsByName();
		
		/* when we pass the reference of name into the construcotr of TreeSet it will sort by name*/
		TreeSet<Student> t = new TreeSet<Student>(name);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student std : t) {
			System.out.println(std);
		}
	}

}
