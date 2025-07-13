package mapprogramming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		HashMap<String, Integer> h = new HashMap();

		h.put("Tom", 23);
		h.put("Jerry", 22);

		Set<String> obj = h.keySet();

		for(String key : obj) {
			System.out.println(key+" is "+h.get(key)+" years old");
		}

		System.out.println("--------------------");

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap();

		lhm.put(10, "Java");
		lhm.put(20, "Sql");
		lhm.put(30, "Web");

		Set<Integer> s = lhm.keySet();

		for(Integer key : s) {
			System.out.println(key+" -> "+lhm.get(key));
		}

		System.out.println("--------------------");

		TreeMap<Integer, Double> t = new TreeMap();

		t.put(10, 1.5);
		t.put(30,  2.5);
		t.put(20, 4.5);

		System.out.println(t); // {10=1.5, 20=4.5, 30=2.5}

		// When we try to put duplicate key the value get overridden  
		t.put(20, 5.5);

		System.out.println(t); // {10=1.5, 20=5.5, 30=2.5}

		Set<Integer> s2 = t.keySet();

		/* sorting happens based on the keys */
		for(int key : s2 ) {
			System.out.println(key+" -> "+t.get(key));
		}





	}

}
