package com;
/* Accessing public members 
   outside the class but different package */
public class TestStudent {
	 
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.marks);
		s.study();
	}
}
