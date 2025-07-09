package com;

public class Person {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println(p); // implicitly it calls toString()
		
		System.out.println(p.toString()); //com.Person@65b3120a
		
		//String Representation called => FullyQualifiedClassName@HexaDecimalValue
		
	}

}
