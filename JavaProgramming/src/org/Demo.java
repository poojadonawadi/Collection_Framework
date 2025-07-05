package org;

public class Demo { 
	static int count=0; 
	public void increment() 
	{ 
		count++; 
	} 
	public static void main(String args[]) 
	{ 
		Demo obj1=new Demo(); 
		Demo obj2=new Demo(); 
		obj1.increment(); 
		obj2.increment(); //static variable distributes the same value for both the objects
		System.out.println("Obj1: count is="+obj1.count);  //2
		System.out.println("Obj2: count is="+obj2.count); //2
	} 
}
