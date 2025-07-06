package bankapp;

public class AccountHolder {
	
	public static void main(String[] args) {
		
		Bank obj = new ATM();
		
		obj.checkBalance();
		
		System.out.println("---------------");
		
		obj.deposit(10000);
		obj.checkBalance();
		
		System.out.println("---------------");
		
		obj.withdraw(3000);
		obj.checkBalance();
		
	}

}
