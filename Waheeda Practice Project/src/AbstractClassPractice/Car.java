package AbstractClassPractice;

public interface Car {

	 int t = 0;
	public  final int numberOfDoors = 4; 
	
	public void reducespeed(); // Definition
	public void increasespead(double speed);
	
   double numPow (double x, double y);
   
   // we can have method body in an interface only the cases below, by using default and static keyword.
	
	//default keyword give permission to create default method in Car interface
   
	public default void depo() {
		System.out.println("default implementation of the method depo");
	}
}
