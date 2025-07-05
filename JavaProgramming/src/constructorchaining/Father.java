package constructorchaining;

//chaining in different class --> 1. IS-A relationship 2. Super() statement

// Implicit super() statement
public class Father {
	
	Father(){
		System.out.println("Non parameterized superclass constructor");
	}
}

class Son extends Father{
	
	Son(){
		//super(); implicitly used
		System.out.println("implicitly called super class constructor");
	}
	
}
