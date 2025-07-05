package constructorchaining;

// if chaining in same class --> this() statement [pronounced as: this calling statement]
public class Box {
	
	Box(){
		this(2, 4);
		System.out.println("1");
	}
	
	Box(int a){
		this();
		System.out.println("2");
	}
	
	Box(int a, int b){
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		Box b = new Box(2);
	}
}

//if there are n Constructors then there must be n-1 calling statements
