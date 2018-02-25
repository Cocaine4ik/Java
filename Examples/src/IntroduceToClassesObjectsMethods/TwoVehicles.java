package IntroduceToClassesObjectsMethods;

public class TwoVehicles {
	public static void main(String args[]) {
		
		Vehicle2 minivan = new Vehicle2();
		Vehicle2 sportscar = new Vehicle2();
		
	int range1, range2;
	
	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	
	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;
	
	range1 = minivan.fuelcap * minivan.mpg;
	range2 = sportscar.fuelcap * sportscar.mpg;
	
	System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range of " + range1);
	System.out.println("Sportscar can carry " + sportscar.passengers + " passengers witch a range of " + range2);
	}
}
