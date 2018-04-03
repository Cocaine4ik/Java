package Inheritance;

// Applying to subclass object link to superclass object demonstration

public class SupSubRef {
	public static void main(String args[]) {
		
		X x = new X(10);
		X x2;
		Y y = new Y(5, 6);
		
		x2 = x;
		System.out.println("x2.a: " + x2.a);
		
		// Class y is subclass of X, so variables õ2 and ó
        // can link to one and the same object of extends class.
		
		x2 = y; 
		System.out.println("x2.a: " + x2.a);
	}
}
