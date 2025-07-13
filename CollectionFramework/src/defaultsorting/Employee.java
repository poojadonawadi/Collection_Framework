package defaultsorting;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	Double salary; //To compare based on the salary we need to make the data type non-primitive

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "Name:"+name+"  Id:"+id+"  Salary:"+salary;
	}
	
	public int compareTo(Employee emp) {
		return this.salary.compareTo(emp.salary);
	}



}
