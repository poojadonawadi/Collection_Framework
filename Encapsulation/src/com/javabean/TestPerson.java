package com.javabean;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setAge(20);
		
		int age = p.getAge();
		
		System.out.println("Age: "+age);
		
		System.out.println(p.getAge());
	}

}
