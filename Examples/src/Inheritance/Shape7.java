package Inheritance;

public class Shape7 {
	public static void main(String args[]) {
		
		Triangle t1 = new Triangle(8.0, 12.0, "right");
		// create a copy of object
		Triangle t2 = new Triangle(t1);
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is: " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t1: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}
