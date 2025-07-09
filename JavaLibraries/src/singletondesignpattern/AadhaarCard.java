package singletondesignpattern;

public class AadhaarCard {

	private static AadhaarCard obj;

	private AadhaarCard() {
		System.out.println("AadhaarCard object created");
	}

	public static void createAdhaarObject() {
		if(obj == null) {
			obj = new AadhaarCard();
		}

	}

}
