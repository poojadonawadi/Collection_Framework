package nonprimitive;

public class Test {

	public static void main(String[] args) {

		/* UPCASTING */
		Father f = new Son();
		System.out.println(f.age);

		/* DOWNCASTING */
		Son s = (Son) f;
		System.out.println(s.age);
		System.out.println(s.name);

		// Son x = new Son();
		// Father y = x;
	}

}
