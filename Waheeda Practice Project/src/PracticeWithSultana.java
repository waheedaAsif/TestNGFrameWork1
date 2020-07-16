
public class PracticeWithSultana {

	
	String name;
	int age;
		
    public PracticeWithSultana() {
    	
    	name = "";
    	age = 0;
    			
    }
      public PracticeWithSultana(String name, int age) {
    	  this.name =name;
    	  this.age = age;
    	  
      }
      
      public void setName(String name) {
    	  this.name = name;  
      }
      public void setName(int age) {
    	  this.age = age;
      }
      public String getName() {
    	  return name;
      }
      public int getAge() {
    	  return age;
      }
      public String getAllData() {
    	  return "Name:"+ name + "Age: " + age;  
      }
	@Override
	public String toString() {
		return "name=" + name + "\n age = " + age;
		
	}
      
	}
        
