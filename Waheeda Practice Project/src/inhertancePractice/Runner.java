package inhertancePractice;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle v = new Vehicle();
		Car a = new Car();
		Volkswogan b = new Volkswogan();
		
		// setter - set values 
		a.setNumberOfTyers(8);
		b.setPurchesYear(2019);
		v.setModel("2020");
		
		System.out.println("#Tires: "+a.getNumberOfTyers());
		
		
		b.setChildSafetyLocks(true);
		b.setColor("Black ");
		
		System.out.println( b.getColor() + "\n"+b.getChildSafetyLocks());
		
	}

}
