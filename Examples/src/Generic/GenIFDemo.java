package Generic;

// demo for containment interface

public class GenIFDemo {
	public static void main(String args[]) {
		
		Integer x[] = { 1, 2, 3 };
		
		MyClass<Integer> ob = new MyClass<Integer>(x);
		
		if(ob.contains(2))
			System.out.println("2 is in ob");
		else
			System.out.println("2 is NOT in ob");
		
		if(ob.contains(5))
			System.out.println("5 is in ob");
		else
			System.out.println("2 is NOT in ob");
		
		// next string of code are impossible because object
		// a variant of implement interface Containment for
		// type Integer, and a value 9.25 concerns to type Double.
		// if(ob.contains(9.25)) // Impossible!!!
		// System.out.println("9.25 is in ob"); ~
		
		
	}
}
