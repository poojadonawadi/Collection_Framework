package methodoverriding;

public class InstaUser {
	
	public static void main(String[] args) {
		
		Instagram3 i3 = new Instagram3();
		
		i3.upload();
		
		System.out.println("---------------");
		
		i3.dm();
		
		System.out.println("---------------");
		
		i3.story();
	}

}
