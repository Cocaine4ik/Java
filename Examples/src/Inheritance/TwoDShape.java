package Inheritance;

// simple classes hierarchy
// class which describes 2-dimensional objects

public class TwoDShape {

	private double width;
	private double height;
	
	// Access methods
	
	double getWidth() {return width;}
	double getHeight() {return height;}
	void setWidth(double w) {width = w;}
	void setHeight(double h) {height = h;}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}
