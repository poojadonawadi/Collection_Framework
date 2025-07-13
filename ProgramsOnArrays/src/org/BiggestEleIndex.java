package org;

public class BiggestEleIndex {

	public static int getIndex(int[] arr) {
		int maxIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void main(String[] args) {

		int[] arr = {2, 3, 17, 4, 8, 9};
		System.out.println(getIndex(arr));
	}

}
