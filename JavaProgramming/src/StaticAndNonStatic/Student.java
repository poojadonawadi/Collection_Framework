package StaticAndNonStatic;

public class Student {
	//Constructor overloading
	
	Student(int age){
		System.out.println("Age: "+age);
	}
	
	Student(String name){
		System.out.println("Name :"+name);
	}
	
	Student(String name, int age){
		System.out.println("Name :"+name+" Age :"+age);
	}
	
	Student(int age, String name){
		System.out.println("Name :"+name+" Age :"+age);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(22, "Tom");
		Student s2 = new Student("Jerry");
		Student s3 = new Student("Alen", 23);
		Student s4 = new Student(24);
	}
}
