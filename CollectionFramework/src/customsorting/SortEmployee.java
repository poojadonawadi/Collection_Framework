package customsorting;

import java.util.TreeSet;

public class SortEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(20, "Sundar", 50.4);
		Employee e2 = new Employee(10, "Cook", 60.7);
		Employee e3 = new Employee(40, "Tata", 40.35);
		
		SortEmployeeById id = new SortEmployeeById();
		SortEmployeeBySalary sal = new SortEmployeeBySalary();
		SortEmployeeByName name = new SortEmployeeByName();
		
		TreeSet<Employee> t = new TreeSet<Employee>(sal); 
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee emp : t) {
			System.out.println(emp);
		}

	
	}

}
