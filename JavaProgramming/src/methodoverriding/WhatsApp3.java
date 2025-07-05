package methodoverriding;

class WhatsApp3 extends WhatsApp2{
	
	@Override
	void display() {
		super.display();
		System.out.println("Blue tick supported");
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("Vedio call supported");
	}
	
	void story() {
		System.out.println("Can upload images as story");
	}

}
