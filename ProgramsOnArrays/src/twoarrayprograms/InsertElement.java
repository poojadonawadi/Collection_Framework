package twoarrayprograms;

public class InsertElement {
	
	/* method to insert an element in particular index */
	public static int[] insertEleInIndex(int[] a, int element, int index) {
		
		if(index < 0 || index > a.length) {
			System.out.println("Index out of range");
			return a;
		}
		int[] resArray = new int[a.length + 1];
		
		resArray[index] = element;
		
		for(int i=0; i<a.length; i++) {
			if(i < index) {
				resArray[i] = a[i];
			}
			else {
				resArray[i+1] = a[i];
			}
		}
		return resArray;	
	}
	
	public static void main(String[] args) {
		
		int[] a = {12, 34, 56, 18, 10, 50};
		
		int[] resArray = insertEleInIndex(a, 39, 2);
		
		for(int i : resArray) {
			System.out.println(i);
		}
	}
}
