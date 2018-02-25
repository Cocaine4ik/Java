package IntroduceToClassesObjectsMethods;

public class RetMeth {
	
	public static void main(String args[]) {
		
		Vehicle2 minivan = new Vehicle2();
		Vehicle2 sportscar = new Vehicle2();	
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16; // minivan stats
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14; //  sportscar stats
		sportscar.mpg = 12;
		
		range1 = minivan.range();
		range2 = sportscar.range();
		System.out.println("Minivan can carry " + minivan.passengers + " passengers " + " with range of " + range1 + " miles.");
		
		System.out.println("Sportscar can carry " + sportscar.passengers + " passengers " + " with range of " + range2 + " miles.");
		}
}
