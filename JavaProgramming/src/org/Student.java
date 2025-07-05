package org;

public class Student {
	String name;
	double perc;
	
	Student(String name, double perc){
		this.name = name; //when both global variables and 
		this.perc = perc; //constructor parameter have same name we should use this keyword to initialize
	}
	
	public static void main(String[] args) {
		Student s = new Student("Tom", 89.6);
		System.out.println("Name: "+s.name+", Percentage: "+s.perc+"%");
	}
}
