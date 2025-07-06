package org;

/*Accessing protected members in different package 
  using import statement and IS-A Relationship*/

import com.Chocolate;

public class Boy extends Chocolate{
	
	public static void main(String[] args) {
		
		Boy b = new Boy();
		System.out.println(b.cost);
		b.eat();
	}

}
