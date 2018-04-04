package Inheritance;

// Class TwoDShape subclass for showing triangles.
// Class Triangle extend from class TwoDShape

public class Triangle extends TwoDShape {

	private String style;
	
	// Using operator super() to call
    // different construct options TwoDShape() .
    // Default construct.
	
	Triangle(){
		super(); // call default superclass construct
		style = "null";
	}
	
	// construct with parameters
	
	Triangle(double w, double h, String s) {
		// Initialization of the parent part of object
		// responded class TwoDSHape		
		super(w, h);
		style = s;		
	}
	
	//construct with one argument
	
	Triangle(double x) {
		super(x); // call superclass construct with one argument
		style = "isosceles";
		
	}
	
	// build one object based on another
	
	Triangle(Triangle ob) {
		// transfer link to object Triangle to construct of the class TwoDShape.
		super(ob);
		style = ob.style;
	}
	double area() {
		// From the class Triangle we can apply members of the class
        // TwoDShape in the same way as for their own members.
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);		
	}
}
