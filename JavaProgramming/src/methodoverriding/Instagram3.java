package methodoverriding;

public class Instagram3 extends Instagram2{
	
	@Override
	void upload() {
		super.upload();
		System.out.println("Can send Vedios");
	}
	
	@Override
	void dm() {
		super.dm();
		System.out.println("Can DM images");
	}
	
	void story() {
		System.out.println("Can upload story");
	}

}
