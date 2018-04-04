package Inheritance;

// simple classes hierarchy
// class which describes 2-dimensional objects

public class TwoDShape {

	private double width;
	private double height;
	private String name;
	
	// default construct
	
	TwoDShape() {
		width = height = 0.0;
		name = "null";
	}
	
	// parameterized construct
	
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	// constructing object with the same
	// variable's values width and height
	
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	
	// build one object based on another
	
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	// Access methods
	
	double getWidth() {return width;}
	double getHeight() {return height;}
	void setWidth(double w) {width = w;}
	void setHeight(double h) {height = h;}
	String getName() { return name; }
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	// method Area identify in class TwoDShape
	
	double Area() {
		System.out.println("area() must be overridden");
		return 0.0;
	}
}
