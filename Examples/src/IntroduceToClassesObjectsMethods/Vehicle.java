package IntroduceToClassesObjectsMethods;

public class Vehicle {
	
	int passengers;
	int fuelcap;
	int mpg;
	
	Vehicle(int p, int f, int m){
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	//return range
	int range() {
		return mpg * fuelcap;
	}
	double fuelneeded(int miles) {
		return (double)miles/mpg;
	}
}
