package Inheritance;

public class TwoDShape {

	private double width;
	private double length;
	private String name;
	
	// default construct with parameters
	
	TwoDShape(double w, double l, String n) {
		width = w;
		length = l;
		name = n;
	}	
	
	// for object with out width
	TwoDShape(double l, String n) {
		length = l;
		name = n;
	}
	
	double getWidth() { return width; }
	void setWidth(double w) { width = w; }
	
	double getLength() { return length; }
	void setLength(double l) { length = l; }
	
	String getName() { return name; }
	void setName(String n) { name = n; }
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + length);
	}
}
