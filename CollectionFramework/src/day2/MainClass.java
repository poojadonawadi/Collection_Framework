package day2;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(30);
		l.add(20);
		l.add(50);
		l.add(10);
		l.add(70);
		
		System.out.println("Befort Sorting:");
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("-------------");
		
		Collections.sort(l);
		
		System.out.println("After Sorting:");
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

}
