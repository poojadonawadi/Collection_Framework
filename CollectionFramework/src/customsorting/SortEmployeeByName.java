package customsorting;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}

}
