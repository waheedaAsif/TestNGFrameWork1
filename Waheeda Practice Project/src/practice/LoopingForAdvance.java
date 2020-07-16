package practice;

public class LoopingForAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//we have a range of numbers between x-y,
		//print all even number first, and then all of the odd numbers in the range
		//1-10
		//2,4,6,8,10
		// second part even number in the range are : 0. 2, 4, 6, 8, 10
		//
		
		
		int x = 1;
		int y = 10;
		
		String even = "Even numbers in the range are:";
		String odd  = "Odd numbers in the range are:";
		
		for(int i = x; i < y; i++) {
			
			if (i % 2 == 0){
				even += i + ", ";
				System.out.println(even);
			}else {
				odd += i + ", ";
				System.out.println(odd);
				
			
			}
			
		}
		
		
	}
		
		 
 
		
		
	
		
		
	}


