package hierarchial;

public class Solution {
	//hierarchical inheritance
	public static void main(String[] args) {
		College_A a = new College_A();
		a.scheduleExam();
		a.conduct();
		
		System.out.println("-----------");
		
		Colleage_B b = new Colleage_B();
		b.payFees();
		b.examFees();
	}
}
