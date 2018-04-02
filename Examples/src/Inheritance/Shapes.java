package Inheritance;

public class Shapes {
	public static void main(String args[]) {
		
		Triangle t1 = new Triangle (4.0, 4.0, "isosceles");
		Triangle t2 = new Triangle (8.0, 12.0, "right");
		
        // All members of the class Triangle, also extends from the class
        // TwoDShape, access from object type Triangle.
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}
