package twoarrayprograms;

public class CountElement {
	
	/* Method to count how many times specified element present in an array */
	public static int getCount(int[] arr, int element) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 2, 4, 2, 5};
		
		System.out.println(getCount(arr, 2));
	}

}
