package storingobjects;

class Customer {
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("HP", 2000, "4GB");
		Laptop l2 = new Laptop("Dell", 3000, "8GB");
		Laptop l3 = new Laptop("Lenovo", 5000, "6GB");
		Laptop l4 = new Laptop("Acer", 10000, "16GB");
		
		Laptop[] l = {l1, l2, l3, l4};
		
		for(int i=0; i<l.length; i++) {
			System.out.println(l[i]);
		}
		
		/* Laptop[] l = new Laptop[4];
		
		l[0] = l1;
		l[1] = l2;
		l[2] = l3;
		l[3] = l4; */
	}

}
