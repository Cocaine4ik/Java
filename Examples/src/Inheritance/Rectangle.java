package Inheritance;

public class Rectangle extends TwoDShape {
	
	// default construct
	Rectangle() {
		super();
	}
	
	Rectangle(double w, double h) {
		super (w, h, "rectangle"); // call construct superclass
	}

	// build square
	Rectangle(double x) {
		super(x, "rectangle"); // call construct superclass
	}
	
	// build one object based in another
	Rectangle(Rectangle ob) {
		super(ob); // call construct superclass
	}
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}
