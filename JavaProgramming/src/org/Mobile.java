package org;

public class Mobile {
	String brand;
	int cost;
	//parameterized constructor
	Mobile(String b, int c){
		brand = b;
		cost = c;
	}
	public static void main(String[] args) {
		Mobile m = new Mobile("Samsung", 50000);
		System.out.println("Brand is: "+m.brand);
		System.out.println("Cost is: "+m.cost);

	}
}
