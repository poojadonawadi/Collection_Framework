package defaultsorting;

import java.util.TreeSet;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(200, "Alex", 5.5);
		Employee e2 = new Employee(100, "Alen", 6.3);
		//Employee e3 = new Employee(300, "Jack", 5.5);
		
		TreeSet<Employee> t = new TreeSet<Employee>();
		
		t.add(e1);
		t.add(e2);
		t.add(new Employee(300, "Jack", 7.5));
		
		for(Employee emp : t) {
			System.out.println(emp);
		}
		
	}

}
