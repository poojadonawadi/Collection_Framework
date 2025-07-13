package com;

public class ReverseArray {
	
	public static void getReversedArray(int[] arr) {
		int left = 0, right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {23,12,45,28,39,40};
		getReversedArray(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);  
		}
	}

}
