package defaultsorting;

import java.util.TreeSet;

public class SortCar {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(200);
		Car c2 = new Car(100);
		Car c3 = new Car(300);
		
		TreeSet<Car> t = new TreeSet();
		
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for(Car c : t) {
			System.out.println(c);
		}
	}

}
