package com.javabean;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setId(101);
		e.setName("Tom");
		
		System.out.println("Id: "+e.getId());
		System.out.println("Name is: "+e.getName());
	}

}
