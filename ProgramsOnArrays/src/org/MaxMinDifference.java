package org;



public class MaxMinDifference {

	public static int getDifference(int[] arr) {
		int max = arr[0]; 
		int min = arr[arr.length-1];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i]<min) {
				min = arr[i];
			}
		}
		return max - min;
	}

	public static void main(String[] args) {

		int[] array = {3, 9, 12, 10, 7, 15};

		System.out.println("The differece between biggest and smallest element is "+getDifference(array));
	}

}
