package com;

public class Employee implements Person{
	
	@Override
	public void work() {		
		System.out.println("Employee working");
	}
	
	public static void main(String[] args) {
		
		System.out.println(Person.id);
		
		Employee emp = new Employee();
		
		emp.work();
	}
}
