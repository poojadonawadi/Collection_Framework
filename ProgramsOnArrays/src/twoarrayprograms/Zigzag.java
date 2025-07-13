package twoarrayprograms;

public class Zigzag {
	
	public static int[] getZigzagOrder(int[] a, int[] b) {
		
		int[] c = new int[a.length + b.length];
		
		int i=0, j=0, k=0;
		
		while(i<a.length && j<b.length) {
			c[k++] = a[i++];
			c[k++] = b[j++];
		}
		while(i<a.length) {
			c[k++] = a[i++];
		}
		
		while(j<b.length) {
			c[k++] = b[j++];
		}
		
		return c;	
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 3, 5, 7, 9};
		int[] b = {2, 4, 6, 8, 0};
		
		int[] res = getZigzagOrder(a, b);
		
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
