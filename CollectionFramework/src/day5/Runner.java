package day5;

import java.util.TreeSet;

public class Runner {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(30);
		t.add(20);
		t.add(50);
		t.add(30);
		t.add(40);
		t.add(10);
		
		System.out.println(t); // [10, 20, 30, 40, 50] => TreeSet always maintains Sorted Order
		
		System.out.println("---------");
		
		for(Integer i : t) {
			System.out.println(i);
		}
	}

}
