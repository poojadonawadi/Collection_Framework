package day3;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		// when we write int it autobox to non primitive
		for(int i : l) { // for(Integer i : l)
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("java");
		ll.add("python");
		ll.add("10");
		
		for(String s : ll) {
			System.out.println(s);
		}
		
		System.out.println("------------");
		
		// Generics is optional at the constructor side
		ArrayList<Double> z = new ArrayList();
		
		z.add(2.3);
		z.add(3.45);
		z.add(8.6);
		
		for(double d : z) {
			System.out.println(d);
		}
		
		
	}

}
//Generics used to specify the element type
