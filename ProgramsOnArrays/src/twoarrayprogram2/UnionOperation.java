package twoarrayprogram2;

public class UnionOperation {
	
	public static int[] union(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			c[i] = a[i];
		}
		int k = a.length;
		for(int i=0; i<b.length; i++) {
			int j=0;
			while(j<a.length) {
				if(b[i] == a[j])
					break;
				else
					j++;
			}
			if(j == a.length) {
				c[k++] = b[i];
			}
		}
		
		int[] res = new int[k];
		for(int i=0; i<k; i++) {
			res[i] = c[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,3,7,10,8,15};
		int[] b = {5,0,7,2,8,12};
		
		int[] minusArray = union(a, b);
		
		for(int i : minusArray) {
			System.out.println(i);
		}
	}

}
