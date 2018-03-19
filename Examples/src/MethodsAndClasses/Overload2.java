package MethodsAndClasses;

// Automatic form transformation can influence to 
// the choice of overload method 

public class Overload2 {
	void f(int x) {
		System.out.println("Inside f(int): " + x);
	}
	
	void f(double x) {
		System.out.println("Inside f(double): " + x);
	}
}
