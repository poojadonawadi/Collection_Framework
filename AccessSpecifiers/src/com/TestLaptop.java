package com;

public class TestLaptop {
	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		System.out.println(l.cost);
		l.develop(); //accessing default members in different class but in same package
	}

}
