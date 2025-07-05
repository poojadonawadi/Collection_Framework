package StaticAndNonStatic;

public class Car {
	//static members
	static String brand = "Audi";
	static int cost = 1000000;
	
	static void drive() {
		System.out.println("Driving car");
	}
	
	public static void main(String[] args) {
		System.out.println("The car is "+brand);
		drive();//static members can be accessed directly
		
		System.out.println("-----------------");
		
		//static members are accessed using class name in different class
		System.out.println("The car is "+Car.brand);
		Car.drive();
	}
}
