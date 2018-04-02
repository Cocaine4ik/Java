package Inheritance;

// Class TwoDShape subclass for showing triangles.
// Class Triangle extend from class TwoDShape

public class Triangle extends TwoDShape {

	String style;
	
	double area() {
		// From the class Triangle we can apply members of the class
        // TwoDShape in the same way as for their own members.
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);		
	}
}
