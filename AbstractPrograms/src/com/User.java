package com;

public class User extends Car{
	
	@Override
	void stop() {
		System.out.println("Car stopped");
	}
	
	@Override
	void start() {
		System.out.println("Car Started");
	}
	
	//Optionally override shiftGears() as well
	
	public static void main(String[] args) {
		
		User u = new User();
		
		u.start();
		u.shiftGears();
		u.stop();
		
	}

}
