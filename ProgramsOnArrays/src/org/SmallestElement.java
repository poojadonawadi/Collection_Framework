package org;

public class SmallestElement {
	
	public static int getSmallestElement(int[] arr) {
		int min = arr[arr.length-1];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		int[] array = {23, 34, 12, 89, 9, 18};
		
		System.out.println("The smallest element is: "+getSmallestElement(array));
	}

}
