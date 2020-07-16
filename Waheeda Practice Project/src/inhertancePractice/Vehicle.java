package inhertancePractice;

public class Vehicle {

	private String name;
	private String color;
	private String model;
	private int year;
	private int doors;
	private double price;
	
	// default constructer
	
	public Vehicle() {
		String name = "";
		String color = "";
		String model = "";
		int year = 0;
		int doors = 0;
		double price = 0.0;
	}
	// primitive Constructer
		public Vehicle(String name, String color, String model, int year, int doors, double price) {
			this.name = name;
			this.color = color;
			this.model = model;
			this.year = year;
			this.doors = doors;
			this.price = price;
		}	
	// Setters
			public void setName(String name) {
				this.name = name;
			}
			public String getName() {
				return name;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getColor() {
				return color;
			}
			public void setModel(String model) {
				this.model = model;
			}
			public String getModel() {
				return model;
			}
			public void setYear(int year) {
				this.year = year;
			}
			public int getYear() {
				return year;
			}
			public void setDoor(int doors) {
				this.doors = doors;
			}
			public int getDoor() {
				return doors;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			public double getprice() {
				return price;
			}
		
	
		
}

