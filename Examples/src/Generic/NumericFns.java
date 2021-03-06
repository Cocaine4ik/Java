package Generic;

// Class NumericFns as an example of unlucky try of creating
// generic class for executing different math
// operations, includes receiving inverse value or
// getting fractional part of numerical value of any type.

public class NumericFns <T extends Number> {
	
	T num;

	// transfer to construct a link to numeral object
	NumericFns(T n) {
		num = n;
	}
	
	// return inverse value
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	
	// return fractional
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
	
	// define equals between absolute values in two object
	boolean absEqual(NumericFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;
		return false;
	}
	
}
