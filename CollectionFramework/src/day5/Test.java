package day5;

import java.util.LinkedHashSet;

public class Test {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet();
		
		lhs.add("java");
		lhs.add("python");
		lhs.add("java");
		lhs.add("JS");
		
		for(String s : lhs) {
			System.out.println(s);
		}
		
		System.out.println("-----------");
		
		System.out.println(lhs); // [java, python, JS] => maintains insertion order
	}

}
