package string;

public class MethodsDemo {

	public static void main(String[] args) {

		String s = new String("Software Developer");

		System.out.println(s.length()); //18

		System.out.println("---------------");

		System.out.println(s.toUpperCase());

		System.out.println("---------------");

		System.out.println(s.toLowerCase());

		System.out.println("---------------");

		System.out.println(s.startsWith("soft"));
		System.out.println(s.startsWith("Soft"));

		System.out.println("---------------");

		System.out.println(s.endsWith("er"));
		System.out.println(s.startsWith("Eloper"));

		System.out.println("---------------");

		System.out.println(s.contains("dev"));
		System.out.println(s.contains("Dev"));		

		System.out.println("---------------");

		System.out.println(s.concat(" in TY"));

		System.out.println("---------------");

		//Software Developer
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(14));

		System.out.println("---------------");

		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf('D'));
		System.out.println(s.indexOf('e'));

		System.out.println("---------------");

		String a = "java";
		String b = "Java";
		String c = "java";

		System.out.println(a.equals(b)); //false
		System.out.println(a.equals(c)); //true

		System.out.println(a.equalsIgnoreCase(b));//true

		System.out.println("---------------");

		String x = "hello students";

		System.out.println(s.substring(3)); //tware Developer
		System.out.println(s.substring(7)); //e Developer

		System.out.println(s.substring(2, 7)); //ftwar
		System.out.println(s.substring(4, 10)); //ware D
	}

}
