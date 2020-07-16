package dateClass;

public class Keywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break, we can use the keyword in loops. It would end the loop
		
		// for(int i = 0; i < 10; i++) {
			 //if(i==5) {
			//	 break;
			// }else {
			//	 System.out.println(i);
				 
		// Continue, the keyword will escape that iteration of the loop
				 
				// for(int i = 0; i < 10; i++) {
				//	 if(i==5) {
					//	 continue;
					// }else {
					//	 System.out.println(i);
					// } 
				// }
				 
				// System.out.println("This is after the loop ended");
		//I have an array of strings {"test", "automation", "job", "test","automation2", "job2", "test2"}
		// is there a duplicate	
						 
				String data [] = {"automation", "test", "job", "test","automation2", "test", "job2", "test2"};
	
				      
				
				outter: for(int i = 0; i < data.length; i++) {
					inner: for(int j = i + 1; j < data.length; j++) {
						 if(data[i].contentEquals(data[j])) {
							 System.out.println("we have duplicate");
							 System.out.println("value = " + data[j]);
							 System.out.println("indexs = " + i +"  "+ j);
							 break outter;
						 }
					 }
				 }
			
					
							 }
						 }
					 
	

		
				
				
	
	
	


