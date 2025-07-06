package nonprimitive;

public class Demo {
	
	public static void main(String[] args) {
		
		Vehicle v = new Car();
		
		System.out.println(v.brand);
		v.start();
		
		System.out.println("----------------");
		
		Car c = (Car) v;
		System.out.println(c.brand+" "+c.fuel);
		c.start();
		c.stop();
		
		
	}

}
