package twoarrayprogram2;

public class ElementFrequency {

	/* method to get frequency of each element in the array */
	public static void getFrequency(int[] arr) {
		
		boolean[] noRepeate = new boolean[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			
			if(noRepeate[i] == false) {
				int count = 1;
				
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						count++;
						noRepeate[j] = true;
					}
				}
				System.out.println(arr[i]+" -> "+count);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12, 34, 12, 45, 78, 34, 78, 78};
		
		getFrequency(arr);
	}
}
