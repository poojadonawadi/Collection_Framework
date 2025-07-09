package singletondesignpattern;

public class User {
	
	public static void main(String[] args) {
		
		Account.createObject(); //Object created
		Account.createObject();
		Account.createObject();
		
		
		/* Since Account Constructor is private 
		   we cannot create an object outside the class
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		*/
		
	}
}
