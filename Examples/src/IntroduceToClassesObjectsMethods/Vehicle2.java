package IntroduceToClassesObjectsMethods;

public class Vehicle2 {
	
	int passengers;
	int fuelcap;
	int mpg;

// calculating range	
	
int range() {
	return(fuelcap * mpg);
	}
// calculating fuel capacity needed for range
double fuelneeded(int miles) {
	return(double) miles / mpg;
}
}
