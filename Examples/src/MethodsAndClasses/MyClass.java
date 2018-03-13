package MethodsAndClasses;

// Public and private access to the class members

public class MyClass {
	
	private int alpha; // private access
	public int beta; // public access
	int gamma; // public access (default)
	
	// Access methods to the variable alpha. 
	// Class members can apply to the private members of the same class.
	
	void setAlpha (int a) {alpha = a; }
	int getAlpha () {return alpha; }
	
}
