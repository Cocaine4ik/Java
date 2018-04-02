package Inheritance;

public class Rectangle extends TwoDShape {
	
	Rectangle(double w, double h) {
		super(w, h);
		// TODO Auto-generated constructor stub
	}

	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}
