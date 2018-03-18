package MethodsAndClasses;

// methods overload

public class Overload {
	
	// the first method variant
	
	void ovlDemo() {
		System.out.println("No parameters");
	}
	
	// overload method ovlDemo with 1 option  type int
	// the second variant of method
	
	void ovlDemo(int a) {
		System.out.println("No parameters" + a);
	}
	
	// overload method ovlDemo with 2 options  type int
	// the third method variant
	
	int ovlDemo(int a, int b) {
		System.out.println("No parameters" + a + " " + b);
		return a + b;
	}
	
	// overload method ovlDemo with 2 options  type double
	// the fourth method variant
	
	double ovlDemo(double a, double b) {
		System.out.println("No parameters" + a + " " + b);
		return a +b;
	}
}
