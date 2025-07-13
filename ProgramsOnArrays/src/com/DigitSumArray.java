package com;

public class DigitSumArray {

	public static int getDigitSum(int n) {
		int sum = 0;
		while(n!=0) {
			int d = n%10;
			sum = sum + d;
			n = n/10;
		}
		return sum;
	}
	
	public static void digitSumArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int res = getDigitSum(arr[i]);
			arr[i] = res;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {12, 23, 34, 19, 10, 15};
		digitSumArray(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		
	}

}
