package com;

public class Solution implements Calculator{
	
	@Override
	public int addition(int a, int b) {	 
		return a + b;
	}
	
	@Override
	public int subtraction(int a, int b) {
		return a - b;	
	}
	
	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}
	
	@Override
	public int division(int a, int b) {
		return a / b;
	}

}
