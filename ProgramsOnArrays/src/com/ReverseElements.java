package com;

public class ReverseElements {
	
	static int reverse(int n) {
		int rev = 0;
		while(n!=0) {
			int d = n%10;
			rev = rev*10 + d;
			n = n/10;
		}
		return rev;
	}
	
	public static void getReverseElements(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int reversed = reverse(arr[i]);
			arr[i] = reversed;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12, 23, 34, 45, 56, 67, 78, 89};
		
		getReverseElements(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
