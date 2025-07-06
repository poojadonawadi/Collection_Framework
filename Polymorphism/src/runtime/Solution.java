package runtime;

public class Solution {
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Car();
		
		v1.start(); 
		
		Vehicle v2 = new Bike();
		
		v2.start(); 
	}

}

//JVM will decide Which implementation should get execute at the run time
// therefore Runtime polymorphism is called Late Binding
