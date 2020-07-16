package dateClass;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testData = "dad";
		StringBuilder sB = new StringBuilder(testData)	;
		
		System.out.println(testData);
		System.out.println(sB.reverse());
		
		String temp = new String(sB);
		System.out.println(temp.equals(testData));
	}

}
