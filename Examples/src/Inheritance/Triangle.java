package Inheritance;

// Class TwoDShape subclass for showing triangles.
// Class Triangle extend from class TwoDShape

public class Triangle extends TwoDShape {

	private String style;
	
	// construct
	
	Triangle(double w, double h, String s) {
		
		// Initialization of the parent part of object
		// responded class TwoDSHape
		
		super(w, h);
		style = s;		
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
