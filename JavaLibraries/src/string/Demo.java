package string;

public class Demo {
	
	public static void main(String[] args) {
		
		String s = new String("A");
		
		System.out.println(s); //A
		System.out.println(s.toString()); //A
		
		System.out.println("----------------");
		
		System.out.println(s.hashCode()); //65
		
		System.out.println("----------------");
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(s1.equals(s2)); //true
	}

}
