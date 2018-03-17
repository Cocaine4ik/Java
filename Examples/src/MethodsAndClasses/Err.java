package MethodsAndClasses;

// returning object, defined by a program developer

public class Err {
	String msg; // message about error
	int severity; // code, defining difficulty in error
	
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}
