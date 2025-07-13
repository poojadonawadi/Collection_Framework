package day5;

import java.util.HashSet;

public class Demo {
	
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add(20);
		h.add(null);
		h.add("java");
		h.add(20);
		h.add(2.5);
		
		for(Object obj : h) {
			System.out.println(obj);
		}
		
		System.out.println("-------");
		
		System.out.println(h); // [null, java, 20, 2.5] => insertion order is not maintained
							   // Duplicates are not allowed
		
		System.out.println("-------");
		
		System.out.println("Size: "+h.size());
		
	}

}
