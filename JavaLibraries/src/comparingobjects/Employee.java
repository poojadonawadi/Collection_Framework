package comparingobjects;

public class Employee {
	
	int id;
	double height;
	
	Employee(int id, double height) {
		this.id = id;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.id == emp.id && this.height == emp.height;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, 5.2);
		Employee e2 = new Employee(101, 5.7);
		
		System.out.println(e1.equals(e2)); //false
		
		System.out.println("--------------------");
		
		System.out.println(new Employee(1, 5.4).equals(new Employee(1, 5.4))); //true
		
		System.out.println("--------------------");
		
		if(e1.equals(e2)) {
			System.out.println("Contents are Same");
		}
		else {
			System.out.println("Contents are different");
		}
	}

}
