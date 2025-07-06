package com;

public class Demo {
	
	public static void main(String[] args) {
		
		Vehicle obj;
		
		obj = new Car();
		
		if(obj instanceof Car) {
			Car c = (Car) obj;
			System.out.println(c.brand+" "+c.fuel);
		}
		else if(obj instanceof Bike) {
			Bike b = (Bike) obj;
			System.out.println(b.brand+" "+b.cost);
		}		
		
	}

}
