package dateClass;

public class Student {
	
	
	private String name;
    private int age;
    
    // Default Constructor
    public Student() {
    	
    	name = "";
    	age = 0;
    }
    // parameterized constructor method
     public Student (String newName, int newAge ) {
    	 name = newName;
    	 age = newAge;
    
    }
     public Student (String newName) {
    	 name = newName;
    	 age =0;
    	 
     }
     
     public String getName() {
    	 return name;
     }
     
     
     
     
}
