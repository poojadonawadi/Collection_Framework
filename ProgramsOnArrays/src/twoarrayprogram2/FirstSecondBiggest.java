package twoarrayprogram2;

public class FirstSecondBiggest {
	
	public static void getFirstAndSecondBiggest(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(arr[i]+" is second biggest element");
			}else if(count == 0) {
				System.out.println(arr[i]+" is biggest element");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3, 7, 10, 5, 9, 15};
		
		getFirstAndSecondBiggest(arr);
	}

}
