package singletondesignpattern;

public class Account {
	
	/*to avoid accessing outside the class making it as private and 
	to access in static helper method making it as static */	 
	private static Account obj = null;
	
	private Account() {
		System.out.println("Object Created");
	}
	
	public static void createObject() {
		
		if(obj == null) {
			obj = new Account();
		}
		else {
			System.out.println("Already object created cannot create again");
		}
	}

}
/* createObject() -> helper method which helps create object only once 
   static because we can access using class name outside the class
*/
