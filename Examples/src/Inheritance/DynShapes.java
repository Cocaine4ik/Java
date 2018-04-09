package Inheritance;

// Dynamic shapes demonstration

public class DynShapes {
	public static void main(String args[]) {
		TwoDShape shapes[] = new TwoDShape[4];
		
		shapes[0] = new Triangle(8.0, 12.0, "right");
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println("object is " + shapes[i].getName());
			// Needed variant of the method area() calling
			// for each geometric shape as own
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}
	}
}
