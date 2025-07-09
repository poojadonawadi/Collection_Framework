package comparingobjects;

public class Student {
	
	int age;
	
	Student(int age){
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) { //Upcasting => Object obj = s1;
										
		Student s = (Student) obj; //downcasting
		return this.age == s.age;
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(20);
		Student s2 = new Student(22);
		
		/* Program for comparing 2 object without overriding equals() 
		
		System.out.println(s1 == s2); //false -> by default equals() compares address of objects
		
		System.out.println(s1.equals(s2)); */
		
		System.out.println(s1.equals(s2)); //false
	}
}
// s1 -> this
// s2 -> s
