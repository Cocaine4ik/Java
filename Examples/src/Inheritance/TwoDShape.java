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
	
	// parameterized construct
	
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	
	// constructing object with the same
	// variable's values width and height
	
	TwoDShape(double x) {
		width = height = x;
	}
	
	// build one object based on another
	
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
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
