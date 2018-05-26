package EnumAutopackAnnotationsStaticimport;

// Features of usage enumeration Transport
// Announce enumeration

public class EnumDemo {
	public static void main(String args[]) {
		

	// Announce link to enumeration Transport
	Transport tp;
	
	// assign variable tp constant AIRPLANE
	
	tp = Transport.AIRPLANE;
	
	// output enumerated value
	System.out.println("Value of tp: " + tp);
	System.out.println();
	
	tp = Transport.TRAIN;
	
	// checking equal of two objects type Transport
	if(tp == Transport.TRAIN) // compare two enumerated values
		System.out.println("tp contains TRAIN.\n");
	
	// Enumeration usage for controlling operator switch
	switch(tp) {
	case CAR:
		System.out.println("A car carries people.");
		break;
	case TRUCK:
		System.out.println("A truck carries freight.");
		break;
	case AIRPLANE:
		System.out.println("An airplane flies.");
		break;
	case TRAIN:
		System.out.println("A train runs of rails.");
		break;
	case BOAT:
		System.out.println("A boat sails of water.");
		break;
	}
	}
}
