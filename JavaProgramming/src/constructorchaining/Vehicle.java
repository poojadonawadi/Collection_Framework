package constructorchaining;

// explicit super() statement --> when super class constructor having parameterized constructor
public class Vehicle {
	
	Vehicle(String fuel){
		System.out.println("Vehicle consumes fuel");
	}
}

class Bike extends Vehicle{
	
	Bike(){
		super("petrol"); // invoking explicitly
		System.out.println("explicitly invoked superclass constructor");
	}
}
