package com;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calci = new Solution();

		System.out.println("WELCOME TO CALCULATOR");
		System.out.println("----------------------");

		while(true) {

			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");

			System.out.println("Enter the choice:");
			int choice = scan.nextInt();

			int a = 0;
			int b = 0;

			if(choice>=1 && choice<=4) {
				System.out.println("Enter the First Number");
				a = scan.nextInt();	
				System.out.println("Enter the Second Number");
				b = scan.nextInt();
			}

			switch(choice) {

			case 1:
				int sum = calci.addition(a, b);
				System.out.println("The sum of "+a+" and "+b+" is "+sum);
				break;

			case 2:
				//int difference = calci.subtraction(a, b);
				System.out.println("The difference of "+a+" and "+b+" is "+calci.subtraction(a, b));
				break;

			case 3:
				//int product = calci.multiplication(a, b);
				System.out.println("The product of "+a+" and "+b+" is "+calci.multiplication(a, b));
				break;

			case 4:
				//double quotient = calci.division(a, b);
				System.out.println("The quotient of "+a+" and "+b+" is "+calci.division(a, b));
				break;

			case 5:
				System.out.println("Thank You!!");
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}

			System.out.println("-----------------");
		}

	}

}
