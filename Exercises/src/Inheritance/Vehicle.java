package Inheritance;

public class Vehicle {
	
	private int passengers; // number of passengers
	private int fuelcap; // volume of fuel tank in gallons
	private int mpg; // fuel usage litter to 
	
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
	
	// access method to examples variables
	int getPassengers() { return passengers; }
	void setPassengers(int p) { passengers = p; }
	
	int getFuelcap() { return fuelcap; }
	void setFuelcap(int f) { fuelcap = f; }
	
	int getMpg() { return mpg; }
	void setMgp(int m) { mpg = m; }
}
