package MethodsAndClasses;

// Initialization of one object using another

public class Summation {
	int sum;
	
	// build an object from integer number
	
	Summation(int num) {
		sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i;
	}
	
	// Building one object from another
	Summation(Summation ob) {
		sum = ob.sum;
	}
	
	
}
