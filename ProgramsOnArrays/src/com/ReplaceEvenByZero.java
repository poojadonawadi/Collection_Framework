package com;

public class ReplaceEvenByZero {
	
	public static void main(String[] args) {
		
		int[] arr = {12, 3, 5, 38, 30, 4};
		
		updateEvenOdd(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void updateEvenOdd(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]%2;
		}
		
	}

}
