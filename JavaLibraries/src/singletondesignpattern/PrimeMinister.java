package singletondesignpattern;

public class PrimeMinister {

	String name = "Modi";

	private static PrimeMinister pm;

	private PrimeMinister() {
		System.out.println("PM Got Elected");
	}

	public static PrimeMinister createAndReturnPMObject() {
		if(pm == null) {
			pm = new PrimeMinister();
		}
		return pm;
	}

}
