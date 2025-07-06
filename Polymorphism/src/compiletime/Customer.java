package compiletime;

public class Customer {

	public static void main(String[] args) {

		Myntra m = new Myntra();
		
		//Compiler will decide the method binding during compile time
		
		m.purchase(10);

		m.purchase("Shoe", 5000);

		m.purchase("Mobile");

		m.purchase(2000, "Earphone");
		
	}

}

/* 10
Shoe 5000
Mobile
2000 Earphone
*/
