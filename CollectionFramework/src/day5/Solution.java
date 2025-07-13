package day5;

import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<String>();

		t.add("bat");
		t.add("Cat");
		t.add("Apple");

		System.out.println(t); //it will sort based on the ASCCI values

		System.out.println("----------");

		for(String s : t) {
			System.out.println(s);
		}
		
		System.out.println("========================");
		
		String a = "A";
		String b = "B";
		
		System.out.println(a.compareTo(b)); // 65-66 = -1
		System.out.println(b.compareTo(a)); // 66-65 = 1
		System.out.println(b.compareTo(b)); // 66-66 = 0
		
		System.out.println("--------------");
		
		Double p = 4.5;
		Double q = 23.34;
		
		System.out.println(p.compareTo(q)); // 4.5 < 23.34 => -1
		System.out.println(q.compareTo(p)); //23.34 > 4.5 => 1 
		System.out.println(p.compareTo(p)); //4.5 == 4.5 => 0
	}

}

   /* 
 * When we add an object inside a TreeSet internally comapreTo() gets called 
 * comapreTo() is method present in Comparable inerface.
 * All Wrapper classes and String implemets Comparable so these classes have overridden comapreTo(). 
 * We can only store homogeneous objects into TreeSet
   */