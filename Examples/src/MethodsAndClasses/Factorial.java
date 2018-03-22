package MethodsAndClasses;

// simple example of recursion

public class Factorial {

	// recursive method
	
	int factR(int n) {
		int result;
		
		if(n==1) return 1;
		
		// Recursive call method FactR
		
		result = factR(n - 1) * n;
		
		return result;
	}
	
	// iteration method
	 int factI(int n) {
	        int t, result;

	        result = 1;
	        for(t = 1; t <= n; t++) result *= t;
	        return result;
	    }
}
