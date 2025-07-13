package day2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example {

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
		
		System.out.println(ll.containsAll(al));
		
		System.out.println("---------------------");
		
		/* removeAll() is used to remove all the objects of one collection from another collection*/
		ll.removeAll(al);
		
		System.out.println("Objects inside ArrayList: "+ll+"  Size: "+ll.size());
		System.out.println(ll.containsAll(al));
		
		
	}

}
