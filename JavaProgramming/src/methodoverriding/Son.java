package methodoverriding;

class Son extends Father{
	
	@Override
	void bike() {
		System.out.println("Son's modified bike");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.bike();
	}
}
