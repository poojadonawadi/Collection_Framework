package storingobjects;

public class Person {
	
	int age;
	String name;
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+" Age: "+this.age;
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person(10, "Tom");
		Person p2 = new Person(11, "Tim");
		Person p3 = new Person(12, "Jerry");
		
		Person[] p = new Person[3];
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		
		//With overriding toString()
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i]);
		}
	}

}
