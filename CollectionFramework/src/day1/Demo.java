package day1;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		/* add() is used to add an object into the collection */
		l.add(10);
		l.add(3.5);
		l.add("java");
		l.add(null);
		l.add(10);
		l.add('a');
		
		System.out.println(l);
		
		System.out.println("-------------");
		
		/* size() is used to return the size of a collection */
		System.out.println(l.size());
		
		System.out.println("-------------");
		
		/* get() is used to get the object based on index position */
		System.out.println(l.get(2));
		
		System.out.println("-------------");
		
		/* contains() is used to check the particular object present in the collection or not */
		System.out.println(l.contains("java"));
		
		System.out.println("-------------");
		
		/* isEmpty() is used to check the collection is empty or not */
		System.out.println(l.isEmpty());
		
		System.out.println("-------------");
		
		/* remove() is used to remove particular object from the collection based on the index*/
		l.remove(3);
		System.out.println(l);
		
		System.out.println("------------");
		
		/* clear() will remove all the object from the collection */
		l.clear();
		System.out.println(l);
		
		System.out.println("=========================");
		
		ArrayList x = new ArrayList();
		
		x.add(20);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(40);
		x.add(50);
		
		System.out.println(x);
		
		/* indexOf() is used to find the index of an object and first occurrence is case of duplication */
		System.out.println(x.indexOf(10));
		System.out.println(x.indexOf(100)); // -1 if the object is not present
		
		System.out.println("-------------");
		
		/* lastIndexOf() used to get last index position of the duplicated object */
		System.out.println(x.lastIndexOf(10)); // 
	}
	
}
