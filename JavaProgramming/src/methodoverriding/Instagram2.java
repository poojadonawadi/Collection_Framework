package methodoverriding;

public class Instagram2 extends Instagram1{
	
	@Override
	void upload() {
		super.upload();
		System.out.println("Can upload GIF");
	}
	
	void dm() {
		System.out.println("Can DM Text message");
	}

}
