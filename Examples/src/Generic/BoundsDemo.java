package Generic;

// show on class NumericsFns

public class BoundsDemo {
	public static void main(String args[]) {
		
		// Class integer usage is conceivable, because he
		// is a subclass, created from class Number.
		
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);
		
		System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
		System.out.println("Fractional component of iOb is " + iOb.fraction());
		
		System.out.println();
		
		// Usage class double is conceivable
		NumericFns<Double>dOb = new NumericFns<Double>(5.25);
		
		System.out.println("Reciprocal of iOb is " + dOb.reciprocal());
		System.out.println("Fractional component of iOb is " + dOb.fraction());
		
		// next code string won't compile, because
		// class String is not extended from class Number
		// NumericFns<String> strOb = new NumericFns<String>("Error");
	}
}
