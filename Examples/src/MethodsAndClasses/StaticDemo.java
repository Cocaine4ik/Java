package MethodsAndClasses;

// application of the static variable

public class StaticDemo {

	int x; // usual example's variable
	static int y; // static variable - this one copy shared by all objects
	
	// return sum of values example's variable x and static variable y
	
	int sum() {
		return x + y;
	}
	
}
