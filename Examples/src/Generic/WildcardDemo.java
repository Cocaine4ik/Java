package Generic;

// show meta character argument usage

public class WildcardDemo {
	public static void main(String args[]) {
		
		NumericFns<Integer> iOb = new NumericFns<Integer>(6);
		NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
		NumericFns<Long> lOb = new NumericFns<Long>(5L);
		
		System.out.println("Testing iOb and dOb.");
		// In this method calling meta character is
		// equal with type Double.
		if(iOb.absEqual(dOb))
			System.out.println("Absolute value are equal.");
		else
			System.out.println("Absolute values differ.");
		
		System.out.println();
		
		System.out.println("Testing iOb and 10b");
		// In this method calling meta character type 
		// argument equal with type Long
		if(iOb.absEqual(lOb))
			System.out.println("Absolute value are equal.");
		else
			System.out.println("Absolute values differ.");
	}
}
