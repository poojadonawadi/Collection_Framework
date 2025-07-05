package methodoverriding;

public class MainUser {
	
	public static void main(String[] args) {
		
		WhatsApp3 w3 = new WhatsApp3();
		
		w3.display();
		
		System.out.println("------------");
		
		w3.call();
		
		System.out.println("-----------");
		
		w3.story();
	}

}
