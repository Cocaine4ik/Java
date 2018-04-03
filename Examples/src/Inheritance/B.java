package Inheritance;

// create subclass expends class A

public class B extends A{
	int i; // this variable i hides variable i from class À	
	
	B(int a, int b) {
		// Operator super.i link to the variable i from the class À
		super.i = a; // variable i from class A
		i = b; // variable i from class B
	}
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in sublcass: " + i);
	}
}

