package Inheritance;

// circle subclass

public class Circle extends TwoDShape {

	// number P
	final double p = 3.14;
	
	// circle construct
	Circle(double l, String n) {
		super(l, n);
		
		}
	
	// method for calculating diameter
	double dia() {
		return getLength() / p;
	}
	
	// method for calculating radius
	double radius() {
		return dia() / 2;
	}
	
	// circle area calculating
	double area() {
		return p * Math.pow(radius(), 2);
	}
}
