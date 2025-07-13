package day2;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		
		System.out.println("Objects inside ArrayList: "+al+"  Size: "+al.size());
		
		System.out.println("------------");
		
		LinkedList ll = new LinkedList();
		
		/* addAll() is used to add all the objects of one collection into another collection */
		ll.addAll(al);
		ll.add(30);
		
		System.out.println("Objects inside ArrayList: "+ll+"  Size: "+ll.size());
		
	}

}
