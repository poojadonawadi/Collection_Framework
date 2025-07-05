package methodoverriding;

public class Car extends Vehicle{
	
	@Override
	void start() {
		super.start(); // calling superclass method using super keyword
		System.out.println("Car started");
	}
}
