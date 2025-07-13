package day3;

public class BoxingDemo {
	
	public static void main(String[] args) {
		
		//Primitive way of representing 10
		int a = 10;
		
		// Non-Primitive way of representing 10
		Integer b = new Integer(10);
		
		System.out.println(a+" "+b);
		
		System.out.println("--------");
		
		//Primitive way representing A
		char x = 'A';
		
		//Primitive way representing A
		Character y = new Character('A');
		
		System.out.println(x+" "+y);
		
		System.out.println("======================");
		
		// Auto Boxing
		int i = 5;
		Integer j = new Integer(i);
		System.out.println(i+" "+j);
		
		char p = 'z';
		Character q = new Character(p);
		System.out.println(p+" "+q);
		
		System.out.println("======================");
		
		// Auto Un-Boxing
		
		Integer c = new Integer(50);
		int d = c;
		System.out.println(c+" "+d);
		
		System.out.println("---------");
		
		Double t = new Double(2.2);
		double s = t;
		System.out.println(t+" "+s);
		
		
	}

}

// All Wrapper classes are predefined classes present in java.lang package
// All Wrapper classes have overridden toString()
