package IntroduceToClassesObjectsMethods;

public class Vehicle {
	
	int passengers; // number of passengers
	int fuelcap; // volume of fuel tank in gallons
	int mpg; // fuel usage litter to 
	
	// Vehicle class construct
	Vehicle(int p, int f, int m){
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	// return range of vehicle
	int range() {
		return mpg * fuelcap;
	}
	
	// calculate fuel volume which is need to
	// pass give path
	double fuelneeded(int miles) {
		return (double)miles/mpg;
	}
}
