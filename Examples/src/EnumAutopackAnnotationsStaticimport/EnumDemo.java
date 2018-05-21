package EnumAutopackAnnotationsStaticimport;

// Features of usage enumeration Transport
// Announce enumeration
enum Transport {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class EnumDemo {
	public static void main(String args[]) {
		

	// Announce link to enumeration Transport
	Transport tp;
	
	// assign variable tp constant AIRPLANE
	
	tp = Transport.AIRPLANE;
	
	// output enumerated value
	System.out.println("Value of tp: " + tp);
	System.out.println();
	
	
	}
}
