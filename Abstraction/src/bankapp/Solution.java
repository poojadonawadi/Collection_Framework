package bankapp;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Bank obj = new ATM();
		
		System.out.println("WELCOME TO ATM");
		System.out.println("--------------");
		
		while(true) {
			
			System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
			System.out.println("Enter the choice:");
			int choice = s.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the amount to be deposited");
				int damt = s.nextInt();
				obj.deposit(damt); //obj.deposit(s.nextInt())
				break;
				
			case 2:
				System.out.println("Enter the amount to be withdraw");
				//int wamt = s.nextInt();
				obj.withdraw(s.nextInt());
				break;
				
			case 3:
				obj.checkBalance();
				break;
				
			case 4:
				System.out.println("Thank You!!");
				System.exit(0); //Terminates the while loop
				
				default:
					System.out.println("Invalid Choice");
			}
			
			System.out.println("-----------------------");
			
		}
	}

}
