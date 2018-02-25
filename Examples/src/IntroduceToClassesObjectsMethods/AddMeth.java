package IntroduceToClassesObjectsMethods;

public class AddMeth {
	public static void main(String args[]) {
		
	Vehicle2 minivan = new Vehicle2();
	Vehicle2 sportscar = new Vehicle2();	
	
	// int range1, range2; // not used because we using method range();
	
	minivan.passengers = 7;
	minivan.fuelcap = 16; // minivan stats
	minivan.mpg = 21;
	
	sportscar.passengers = 2;
	sportscar.fuelcap = 14; //  sportscar stats
	sportscar.mpg = 12;
	
	System.out.print("Minivan can carry " + minivan.passengers + " passengers. ");
	minivan.range(); // show range by minivan
	
	System.out.print("Sportscar can carry " + sportscar.passengers + " passengers. ");
	sportscar.range(); // show range by sportscar
	}
}

