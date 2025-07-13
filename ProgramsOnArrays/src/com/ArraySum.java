package com;

public class ArraySum {
	
	public static int getArraySum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] x = {3, 12, 4, 6, 9, 1};
		
		System.out.println("The of all the array elemens is: "+getArraySum(x));
	}

}
