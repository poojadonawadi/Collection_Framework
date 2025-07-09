package com;

public class Employee {

	@Override
	public int hashCode() {
		return 124;
	}

	public static void main(String[] args) {

		Employee e = new Employee();

		//System.out.println(e.hashCode()); //1706234378 -> without overriding hashCode()

		System.out.println(e.hashCode()); // 124
	}

}
