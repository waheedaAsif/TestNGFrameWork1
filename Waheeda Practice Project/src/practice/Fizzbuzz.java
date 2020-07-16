package practice;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//Solution for fizzbuzz
		
	for (int i = 1; i <= 100; i++) { 
		
	 if (i%3==0 && i%5==0){
	  System.out.println("fizzbuzz");
	
	}else if  (i%3==0) {
		
	  System.out.println("fizz");
	  
	}else if  (i%5==0) {
		System.out.println("buzz");
		
	}else {
		System.out.println(i);
	
		
	}
	 }
		
	int c = 1;
	while (c <101){
    if(c % 3==0 && c % 5==0){
			
    System.out.println("FizzBuzz");
			
		}else if (c % 3==0) {
			System.out.println("Fizz");
		}else if (c % 5==0) {
			System.out.println("Buzz");
		}else {
			System.out.println(c);
		}
		c++;
	
	}





		
		
		
	}

	}

