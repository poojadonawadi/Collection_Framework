package primitivecasting;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("-----Widening----");
		
		int a = 10;
		double b = a;
		System.out.println(a+" "+b); //10 10.0
		
		char c = 'A';
		int d =  c;  
		System.out.println(c+" "+d); //A 65
		
		System.out.println("-----Narrowing-----");
		
		double x = 3.5;
		int y = (int) x;
		System.out.println(x+" "+y); // 3.5 3
		
		int p = 66;
		char q = (char) p;
		System.out.println(p+" "+q); //66 B
		
		System.out.println("================");
		
		System.out.println("A"+"B"); //AB
		
		System.out.println("A"+20); //A20
		
		System.out.println('A'+'B'); //65+66=131
		
		System.out.println('a'+20); //97+20 = 117
		
		System.out.println('a'+"a"); //aa
		
	}

}
