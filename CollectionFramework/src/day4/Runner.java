package day4;

import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Ambani");
		Employee e2 = new Employee(102, "Cook");
		Employee e3 = new Employee(103, "Sundar");
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		for(Employee emp : l) {
			System.out.println(emp);
		}
		
	}

}
