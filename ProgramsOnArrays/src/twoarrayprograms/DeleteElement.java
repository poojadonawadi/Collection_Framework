package twoarrayprograms;

public class DeleteElement {

	public static int[] removeElement(int[] a, int index) {

		if(index < 0 || index >= a.length) {
			System.out.println("Index out of range");
			return a;
		}

		int[] b = new int[a.length - 1];

		for(int i=0; i<a.length-1; i++) {
			if(i < index) {
				b[i] = a[i];
			}
			else {
				b[i] = a[i+1];
			}
		}
		return b;
	}

	public static void main(String[] args) {

		int[] a = {12, 34, 56, 18, 10, 50};

		int[] result = removeElement(a, 5);

		for(int i : result) {
			System.out.println(i);
		}
	}

}
