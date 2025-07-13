package twoarrayprograms;

public class InsertArray {

	/* Insert one array into another from particular index*/
	public static int[] insert(int[] a, int[] b, int index) {

		if(index<0 && index > a.length-1) {
			System.out.println("Index out of range");
			return null;
		}

		int[] c = new int[a.length+b.length];

		for(int i=0; i<a.length; i++) {
			if(i<index) {
				c[i]=a[i];
			}
			else {
				c[i+b.length]=a[i];
			}
		}
		for(int i=0; i<b.length; i++) {
			c[i+index] = b[i];
		}
		return c;
	}

	public static void main(String[] args) {

		int[] a = {2, 6, 8, 9};

		int[] b = {1, 3, 4, 6, 7};

		int[] res = insert(a, b, 2);

		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]+" ");
		}
	}

}
