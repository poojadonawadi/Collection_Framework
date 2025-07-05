package StaticAndNonStatic;

public class Person {
	//non static variable
	String name = "Arya";
	
	//non static method
	void work() {
		System.out.println("Arya is working");
	}
	//non static members are accessed by object reference variable
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Name is "+p.name);
		p.work();
	}
}
