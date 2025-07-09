package org;

public class Person {
	
	@Override
	public String toString() {
		return "Hii";
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println(p); //implicitly calls toString()
		
		System.out.println(p.toString()); //explicitly calls toString()
	}

}
