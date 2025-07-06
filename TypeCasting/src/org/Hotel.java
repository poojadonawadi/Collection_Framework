package org;

public class Hotel {
	
	Food orderFood(int choice) {
		
		if(choice == 1) {
			Idly i = new Idly();
			return i;  // return new Idly();
		}
		else if(choice == 2) {
			Dosa d = new Dosa();
			return d;  // return new Dosa();
		}
		else {
			Tea t = new Tea();
			return t; // return new Tea();
		}
	}

}
