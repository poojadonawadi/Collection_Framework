package string;

public class Test {
	
	public static void main(String[] args) {
		
		//1. Empty Representation of a String Objects
		String s1 = new String();// it is similar to String s1 = "";
		System.out.println(s1);
		
		//2. Passing Set of characters
		String s2 = new String("India");
		System.out.println(s2);//India
		
		char[] c = {'j', 'a', 'v', 'a'};
		
		//3. Converting char[] into a String Object
		String s3 = new String(c);
		System.out.println(s3); //java
	}

}
