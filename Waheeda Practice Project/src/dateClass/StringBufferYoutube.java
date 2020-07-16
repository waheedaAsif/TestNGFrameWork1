package dateClass;

public class StringBufferYoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer sb = new StringBuffer();
		// capacity tell us the StringBuffer how many characters are stored 
		System.out.println(sb.capacity()); // 16 + String length which is equal to 23 16 is default capacity.
		  sb.append("hello waheeda");
		  System.out.println( sb.capacity());
		
	}

}
