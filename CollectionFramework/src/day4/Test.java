package day4;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(21, "Tom");
		Student s2 = new Student(22, "Jerry");
		Student s3 = new Student(23, "Smith");
		
		ArrayList<Student> l = new ArrayList<Student>();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		for(Student s : l) {
			// System.out.println(s); => string representation 
			System.out.println("Name:"+s.name+"  Age:"+s.age);
		}
		
	}

}
