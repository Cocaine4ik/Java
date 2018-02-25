package IntroduceToClassesObjectsMethods;

public class CompFuel {
	public static void main(String args[]) {
		
		Vehicle2 minivan = new Vehicle2();
		Vehicle2 sportscar = new Vehicle2();
		
		double gallons;
		int dist = 252;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16; // minivan stats
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14; //  sportscar stats
		sportscar.mpg = 12;
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel");
		
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel");
	}
}

