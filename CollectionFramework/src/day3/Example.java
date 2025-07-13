package day3;

import java.util.ArrayList;

public class Example {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 'z';
		
		ArrayList l = new ArrayList();
		
		l.add(a); //l.add(new Integer(a)); => l.add(new Integer(10));
		l.add(34.5); // l.add(new Double(34.5)); 
		l.add(b); // l.add(new Character(b)); => l.add(new Character('z'));
		
		for(Object obj : l) {
			System.out.println(obj);
		}
	}

}
