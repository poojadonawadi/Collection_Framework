package com;

public class Guy extends Company implements Developer, Tester{ //class can implement n no. of interfaces 
															   // but extends only one class  which should be given priority
	@Override
	public void develop() {
		System.out.println("Developing App");
	}
	
	@Override
	public void test() {
		System.out.println("Testing App");
	}
	
	// Optionally override work()
	
	public static void main(String[] args) {
		
		Guy g = new Guy();
		
		g.develop();
		g.test();
		g.work();
	}

}
