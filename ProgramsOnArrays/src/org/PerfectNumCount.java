package org;

public class PerfectNumCount {

	public static boolean isPerfect(int n) {
		int sum = 0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum = sum + i;
			}
		}
		return sum == n;
	}

	public static int getPerfectCount(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(isPerfect(arr[i])) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = {12, 4, 6, 28, 18, 498};

		System.out.println("The perfect number count in the array is "+getPerfectCount(arr));

	}

}
