package twoarrayprogram2;

public class MinusOperation {
	
	/* Method to return elements from 1st array ehich are not there in second array */
	public static int[] minus(int[] x, int[] y) {
		int[] z = new int[x.length];
		int k = 0;
		for(int i=0;i<x.length; i++) {
			int j = 0;
			while(j<y.length) {
				if(x[i] == y[j])
					break;
				else
					j++;
			}
			if(j == y.length) 
				z[k++] = x[i];
		}
		int[] res = new int[k];
		
		for(int i=0; i<k; i++) {
			res[i] = z[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] x = {2,3,7,10,8,15};
		int[] y = {5,0,7,2,8,12};
		
		int[] minusArray = minus(x, y);
		
		for(int i : minusArray) {
			System.out.println(i);
		}
		
	}

}
