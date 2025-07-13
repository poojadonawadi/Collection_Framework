package twoarrayprograms;

public class RemoveDuplicates {
	
	public static int[] getUniqueArray(int[] x) {
		
		int[] y = new int[x.length];
		y[0] = x[0];
		int k=1;
		for(int i=1; i<x.length; i++) {
			int j = k-1;
			while(j>=0) {
				if(x[i] == x[j]) {
					break;
				}else
					j--;
			}
			if(j == -1) {
				y[k++] = x[i]; 
			}
		}
		int[] res = new int[k];
		for(int i=0; i<k; i++) {
			res[i] = y[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] x = {12, 34, 12, 35, 56, 12, 34};
		
		int[] resArray = getUniqueArray(x);
		
		for(int i : resArray) {
			System.out.println(i);
		}
	}

}
