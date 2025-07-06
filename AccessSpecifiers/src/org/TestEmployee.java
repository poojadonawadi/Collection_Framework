package org;

/* Accessing public members in different package 
   by importing class name along with package name*/

import com.Employee; 

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.work();
	}
}
