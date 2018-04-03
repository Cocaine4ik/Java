package Inheritance;
// Expending class Vehicle for trucks
public class Truck extends Vehicle {

	private int cargocap; // carrying capacity
	
	Truck(int p, int f, int m, int c) {
		/* Initialization variable from the class Vehicle
           use to calling constructor of this class */		
		super(p, f, m);
		cargocap = c;
	}
	
	// access methods to variable cargocap
	int getCargo() { return cargocap; }
	void setCargo(int c) { cargocap = c; }
}
