package twoarrayprogram2;

public class NthBiggestElement {
	
	public static int getNthBiggest(int[] x, int n) {
		
		for(int i=0; i<x.length; i++) {
			int count = 0;
			for(int j=0; j<x.length; j++) {
				if(x[j] > x[i]) {
					count++;
				}
			}
			if(count == n-1) {
				return x[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3, 7, 10, 5, 9, 15};
		
		System.out.println(getNthBiggest(arr, 3));
		
	}

}
