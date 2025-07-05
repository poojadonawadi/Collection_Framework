package StaticAndNonStatic;

public class Netflix {
	//method overloading
	
	public void watch(String movie, String series) {
		System.out.println("Watching "+movie+" and "+series);
	}
	
	public static void watch(String series, int seasons) {
		System.out.println("the series "+series+" has "+seasons+" seasons");
	}
	
	public String watch(String seriesName) {
		return seriesName;
	}
	
	public static void main(String[] args) {
		Netflix n = new Netflix();
		n.watch("MoneyHeist", 5);
		System.out.println(n.watch("Lupin"));
		n.watch("Final Destination", "Wednesday");
	}
}
