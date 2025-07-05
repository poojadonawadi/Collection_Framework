package org;

public class Person {
	String name = "Chetan";
	int age = 20;
	
	public void display() {
		String name = "Shiva";
		int age = 17;
		
		//Variable shadowing: Local variables dominate in local scope over instance variable
		System.out.println("Name is :"+name); //Shiva
		System.out.println("Age is: "+age); //17
		
		System.out.println("-------------------");
		
		System.out.println("Name is :"+this.name);
		System.out.println("Age is: "+this.age);
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.display();
		
	}
}
