package dateClass;

public class StaticWithIteration {

	
	static int count = 0;
	
	public StaticWithIteration() {
		count++;
		System.out.println(count);
	}
	public static void main (String[]Arg) {
		
		StaticWithIteration a = new StaticWithIteration();
		StaticWithIteration b = new StaticWithIteration();
		StaticWithIteration c = new StaticWithIteration();
	}
}
