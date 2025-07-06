package runtime;

public class MainClass {
	
	static void invokeWork(Employee emp) {
		
		emp.work();
	}
	
	public static void main(String[] args) {
		
		invokeWork(new Tester());
		invokeWork(new Developer());
		
		System.out.println("--------------");
		
		Tester t = new Tester();
		invokeWork(t);
		
		Developer d = new Developer();
		invokeWork(d);
	}

}
