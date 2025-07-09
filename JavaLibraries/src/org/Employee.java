package org;

public class Employee {
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "Name: "+name+" Id: "+id;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Alen");
		Employee e2 = new Employee(102, "Alex");
		
		System.out.println(e1);
		System.out.println(e2.toString());
	}

}
