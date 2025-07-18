package twoarrayprograms;

public class MergeInSortedOrder {

	/* Merger to sorted array in sorted format*/
	public static int[] getSortedArray(int[] a, int[] b) {

		int[] c = new int[a.length + b.length];

		int i=0, j=0, k=0;

		while(i<a.length && j<b.length) {
			if(a[i] < b[j]) 
				c[k++] = a[i++];
			else 
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

		int[] a = {2, 6, 8, 9};

		int[] b = {1, 3, 4, 6, 7};

		int[] res = getSortedArray(a, b);

		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]+" ");
		}
	}

}
