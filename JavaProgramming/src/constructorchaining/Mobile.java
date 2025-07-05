package constructorchaining;

public class Mobile {
	String brand;
	String modelNo;
	int cost;
	
	Mobile(String brand){
		this.brand = brand;
	}
	
	Mobile(String brand, String modelNo){
		this(brand);
		this.modelNo = modelNo;		
	}
	
	Mobile(String brand, String modelNo, int cost){
		this(brand, modelNo);
		this.cost = cost;		
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile("Apple", "16Series", 150000);
		System.out.println("Brand is "+m.brand);
		System.out.println("Model number is "+m.modelNo);
		System.out.println("Cost is "+m.cost+" Rupees");
		
	}
}
