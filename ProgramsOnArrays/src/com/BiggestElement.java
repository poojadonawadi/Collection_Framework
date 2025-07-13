package com;

public class BiggestElement {

	public static int findBiggest(int[] arr) {

		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] arr = {12, 23, 34, 78, 56, 67, 89, 45,};

		System.out.println("The biggest element is :"+findBiggest(arr));
	}

}
