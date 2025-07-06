package org;

import java.util.Scanner;

public class Customer {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the choice:");
		int choice = scan.nextInt();
		
		Hotel h = new Hotel();
		
		Food obj = h.orderFood(choice);
		
		if(obj instanceof Idly) {
			System.out.println("Ordered Idly");
		}
		else if(obj instanceof Dosa) {
			System.out.println("orderd Dosa");
		}
		else {
			System.out.println("Orderd Tea");
		}
	}

}
