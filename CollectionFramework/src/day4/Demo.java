package day4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Demo {
	
	public static void main(String[] args) {
		
		/* Overloadded Constructors of ArrayList, Vector and LinkedList */
		
		ArrayList x = new ArrayList();
		x.add(10);
		System.out.println(x);
		
		LinkedList y = new LinkedList(x);
		y.add(20);
		System.out.println(y);
		
		Vector z = new Vector(y);
		z.add(30);
		System.out.println(z);
		
		System.out.println("---------------------------");
		
		ArrayList a = new ArrayList(); // Initial Capacity = 10
		
		ArrayList a1 = new ArrayList(50); // Initial Capacity = 50
		
		LinkedList ll = new LinkedList();
		
		Vector v = new Vector(); // Initial Capacity = 10
		
		Vector v1 = new Vector(30); // Initial Capacity = 30
		
		Vector v2 = new Vector(60, 5); // Initial Capacity = 60, Incremental Capacity 60*5
		
	}

}
