
public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i = 1; i <= 10; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.print(" ");
			for(int k = 10; k >= i; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
