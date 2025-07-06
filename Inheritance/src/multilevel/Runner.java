package multilevel;

public class Runner {
	public static void main(String[] args) {
		Engine e = new Engine();
		System.out.println(e.brand+", "+e.cost);
		e.start();
		e.drive();
		e.consume();
	}
}
