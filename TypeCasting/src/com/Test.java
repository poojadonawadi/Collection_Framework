package com;

public class Test {
	
	public static void main(String[] args) {
		
		Son s = new Son();
		Daughter d = new Daughter();
		Father f = new Father();
		
		System.out.println(s instanceof Son); //true
		System.out.println(s instanceof Father); //true
		
		System.out.println(d instanceof Daughter); //true
		System.out.println(d instanceof Father); //true
		
		System.out.println(f instanceof Father); //true
		System.out.println(f instanceof Son); //false
		System.out.println(f instanceof Daughter); //false
		
		System.out.println("------------------------");
		
		System.out.println(new Son() instanceof Father); //true
		System.out.println(new Daughter() instanceof Father); //true
		System.out.println(new Father() instanceof Daughter); //false
	}

}
