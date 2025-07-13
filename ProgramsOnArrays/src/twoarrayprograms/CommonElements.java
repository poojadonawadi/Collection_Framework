package twoarrayprograms;

public class CommonElements {
	
	public static int[] getCommonElements(int[] x, int[] y) {
		
		int[] c = new int[x.length];
		
		int k=0;
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<y.length; j++) {
				if(x[i] == y[j]) {
					c[k++] = x[i];
					break;
				}
			}
		}
		int[] res = new int[k];
		for(int i=0; i<k; i++) {
			res[i] = c[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] x = {2, 6, 8, 9};

		int[] y = {1, 2, 4, 8, 7};
		
		int[] res = getCommonElements(x, y);
		
		for(int i : res) {
			System.out.println(i);
		}

	}

}
