package practice;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"");
			}
			System.out.print("   "); 
			for (int k = 1; k <= 5 - i + 1; k++) {
				System.out.print(k);
			}
			System.out.println();
		
		}	
}
}