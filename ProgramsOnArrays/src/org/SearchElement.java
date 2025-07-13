package org;

public class SearchElement {

	public static int searchElement(int[] arr, int element) {

		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = {23, 12, 34, 45, 16, 18, 25};

		System.out.println(searchElement(array, 10));

	}

}