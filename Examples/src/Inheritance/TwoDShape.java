package Inheritance;

// simple classes hierarchy
// class which describes 2-dimensional objects

public class TwoDShape {

	private double width;
	private double height;
	
	// default construct
	
	TwoDShape() {
		width = height = 0.0;
	}
	
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	
	// constructing object with the same
	// variable's values width and height
	
	TwoDShape(double x) {
		width = height = x;
	}
	
	// Access methods
	
	double getWidth() {return width;}
	double getHeight() {return height;}
	void setWidth(double w) {width = w;}
	void setHeight(double h) {height = h;}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}
