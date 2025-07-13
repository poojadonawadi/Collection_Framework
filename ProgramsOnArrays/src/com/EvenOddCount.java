package com;

public class EvenOddCount {

	public static void getEvenOddCount(int[] array) {
		int evenCount = 0, oddCount = 0;
		for(int i=0; i<array.length; i++) {

			if(array[i]%2 == 0) {
				evenCount++;
			}
			else
				oddCount++;
		}
		System.out.println("The even count is "+evenCount);
		System.out.println("The odd count is "+oddCount);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 42, 29, 10, 27, 29, 34};
		
		getEvenOddCount(arr);
			
	}

}
