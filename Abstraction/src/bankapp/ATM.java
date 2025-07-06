package bankapp;

public class ATM implements Bank{
	
	int balance = 4000;
	
	@Override
	public void deposit(int amount) {
		balance = balance + amount; //balance += amount
		System.out.println("Rs."+amount+" deposited successfully");
	}
	
	@Override
	public void checkBalance() {
		System.out.println("The balance is Rs."+balance);
	}
	
	@Override
	public void withdraw(int amount) {
		balance = balance - amount; //balance -=amount
		System.out.println("Rs."+amount+" withdrawn successfully");
	}

}
