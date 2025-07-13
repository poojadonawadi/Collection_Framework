package customsorting;

public class Employee {
	
	int id;
	String name;
	Double salary;
	
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Name:"+name+"  Id:"+id+"  Salary:"+salary;
	}

}
