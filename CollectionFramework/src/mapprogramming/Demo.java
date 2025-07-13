package mapprogramming;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {

		HashMap h = new HashMap();

		// put() is used to add key and value inside Map
		h.put(10, "Tom");
		h.put("Jerry", 2.3);
		h.put(3.4, 100);

		System.out.println(h);

		System.out.println("---------");

		/* get() used to get value based on the key specified */
		System.out.println(h.get(10));
		System.out.println(h.get(230));

		System.out.println("---------");

		/* containsKey() used to check if key is present or not  */
		System.out.println(h.containsKey("Tom"));
		System.out.println(h.containsKey("tom"));

		System.out.println("---------");

		/* containsVlaue() used to check if key is present or not  */
		System.out.println(h.containsValue(2.3));
		System.out.println(h.containsValue(3.4));

		System.out.println("---------");
		
		System.out.println(h);
		
		/* remove() used to remove a value based on the key specified */
		h.remove(10);

		System.out.println(h);
		
		System.out.println("---------");
		
		/* isEmpty() used to check if the collection is empty or not */
		System.out.println(h.isEmpty());
		
		/* clear() is used to remove all the objects from the map */
		h.clear();
		
		System.out.println(h.isEmpty());
		

	}

}
