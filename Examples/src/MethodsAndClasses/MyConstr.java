package MethodsAndClasses;

// demonstration on constructors overload

public class MyConstr {
	
	int x;
	
	// constructors can overload in different ways
	
	MyConstr() {
		System.out.println("Inside MyConstr().");
	    x = 0 ;
	}
	
	MyConstr(int i) {
        System.out.println("Inside MyConstr(int).");
        x = i ;
	}
	MyConstr(double d) {
        System.out.println("Inside MyConstr(double).");
        x = (int) d;
	}
	
    MyConstr(int i, int j) {
        System.out.println("Inside MyConstr(int, int).");
        x = i * j;
    }
	}
