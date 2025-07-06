package primitivecasting;

import java.util.Scanner;

/*Dynamic inputs from user using scanner class */

public class Test {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no of elements to be inserted:");
		int size = scan.nextInt();
		
		int[] a = new int[size];
		
		System.out.println("Enter  "+size+" Elements");
		
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Array elements are:");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(i+" => "+ a[i]);
		}
		
		System.out.println("Enter the element to find the no of occurances:");
		int element = scan.nextInt();
		
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			if(element == a[i]) {
				count++;
			}
		}
		
		System.out.println("No of Occurances of "+element+" is "+count);
		
	}

}
