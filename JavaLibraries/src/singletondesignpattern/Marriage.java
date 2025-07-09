package singletondesignpattern;

public class Marriage {

	int age = 27;

	private static Marriage m;

	private Marriage() {
		System.out.println("Got married");
	}

	public static Marriage createObject() {
		if(m == null) {
			m = new Marriage();
		}
		return m; //m => object address to access member variables of class
	}

}
