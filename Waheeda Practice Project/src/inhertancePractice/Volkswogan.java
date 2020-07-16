package inhertancePractice;

public class Volkswogan extends Car {

	private String parkingSensor;
	private boolean childSafetyLocks;
	private int purchesYear;
	
	
	public Volkswogan() {
		super();
	String parkingSensor = "";
	boolean childSafetyLocks = false;
	int purchesYear = 0;
	}

    // parameterized Constructer
	public Volkswogan(String name, String color, String model, int year, int doors, double price, String transmission,
			String engine, int numberOftyers, String parkingSensor, boolean childSafetyLocks, int purchesYear) {
		super(name, color, model, year, doors, price, transmission, engine, numberOftyers);
		this.parkingSensor = parkingSensor;
		this.childSafetyLocks = childSafetyLocks;
		this.purchesYear = purchesYear;
	}
	// Setter
		public void setParkingSensor(String parkingSensor) {
			this.parkingSensor = parkingSensor;
		}
		public String getParkingSensor() {
			return parkingSensor;
		}
		public void setChildSafetyLocks(boolean childSafetyLocks) {
			this.childSafetyLocks = childSafetyLocks;
		}
		public boolean getChildSafetyLocks() {
			return childSafetyLocks;
		}
		public void setPurchesYear(int purchesYear) {
			this.purchesYear = purchesYear;
		}
		public int getPurchesYear() {
			return purchesYear;
	}
	

	}

