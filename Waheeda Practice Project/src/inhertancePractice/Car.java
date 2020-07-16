package inhertancePractice;

public class Car extends Vehicle{

	private String transmission;
	private String engine;
	static int numberOfTyers = 4;
	
	public Car() {
		super();
		transmission = "";
		engine = "";
	}
	public Car(String name, String color, String model, int year, int doors, double price, String transmission,
			String engine, int numberOftyers) {
		
		super(name, color, model, year, doors, price);
		
		this.transmission = transmission;
		this.engine = engine;
		this.numberOfTyers = numberOfTyers;
	}
	
	 // Setter
	    public void setTranmission(String transmission) {
	    	this.transmission = transmission;
	    }
	    public String getTransmission() {
	    	return transmission;
	    }
	    public void setEngine(String engine) {
	    	this.engine =engine;
	    }
	    public String getEngine() {
	    	return engine;
	    }
	    public void setNumberOfTyers(int numberOfTyers) {
	    	this.numberOfTyers = numberOfTyers;
	    }
	    public int getNumberOfTyers() {
	    	return numberOfTyers;
		
	}
	    
	  
}
