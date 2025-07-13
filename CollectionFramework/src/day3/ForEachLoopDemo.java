package day3;

public class ForEachLoopDemo {
 
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30};
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("-----------");
		
		for(int i : a) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		double[] percentage = {1.2, 2.4, 3.2, 3.5};
		
		for(double z : percentage) {
			System.out.println(z);
		}
		
		System.out.println("-----------");
		
		String[] fruits = {"Apple", "Mango", "Grapes"};
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}
	
}
