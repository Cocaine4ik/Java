package EnumAutopackAnnotationsStaticimport;

// Using construct, example's variable,
// method in enumeration

enum Transport {
	// Pay attention for initialized variable of constant
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
	
	// Announce example's variable
	private int speed; // usual speed of every transport
	
	// Announce construct
	Transport(int s) {
		speed = s;
	}
	
	// Define method
	int getSpeed() { return speed; }
	
}
public class Enum {

}
