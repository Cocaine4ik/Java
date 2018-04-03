package Inheritance;

// Subclass extends from class Triangle.

// Class ColorTriangle is subclass,
// extends from class Triangle, which
// which is expends class TwoDShape
// Consequently to the class ColorTriangle includes variables
// and methods from the class Triangle like from the class TwoDShape.

public class ColorTriangle extends Triangle {

	private String color;
	
	ColorTriangle(String c, String s, double w, double h) {
		super(h, w, s);
		color = c;
	}

	String getColor() { return color; }
	void setColor(String c) { color = c; }
	
	void showColor() {
		System.out.println("Color is " + color);
	}
}
