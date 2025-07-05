package org;

// variable declaration, data types and method declaration
public class Vehicle {
	String name;
	int cost;
	String color;
	double milage;
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.name = "Duke";
		v1.cost = 100000;
		v1.color = "Orange";
		v1.milage = 30.5;
		
		System.out.println("-----vehicle details-------");
		
		System.out.println("the vehicle name is "+v1.name);
		System.out.println("the cost "+v1.cost+" rupees");
		System.out.println("the color is "+v1.color);
		System.out.println("the vehicle gives "+v1.milage+" kmph");
	}
}
