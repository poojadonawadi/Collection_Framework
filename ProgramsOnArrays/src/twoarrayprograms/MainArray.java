package twoarrayprograms;

public class MainArray {
	
	/* Method for Pair of elements whose sum is equal to number od elements */
	public static void getPairs(int[] a, int n) {
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] + a[j] == n)
				System.out.println(a[i]+", "+a[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {9,6,1,2,4,7,3,5,8,0};
		
		getPairs(a, 10);
	}

}
