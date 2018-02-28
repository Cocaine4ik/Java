package HouseBuilding;

public class House {

	// Symbol codes for building DEFAULT home
	
	// dash - 45, straight slash - 124, equal - 61
	// left square bracket - 91, right square bracket - 93
	// left brace - 123, right brace - 125
	
	int roof = 45; // roof
	int wall = 124; // wall
	int lw = 91; // left part of the window
	int rw = 93; // right part of the window
	int foundation = 45; // ground
	int ld = 123; // left door part
	int rd = 125; // right door part
	int md = 61; // main door part
	
// making spaces between the text	
	void printSpace() {
	System.out.println();
	System.out.println();
}

//printing line with 16 symbols, using for printing roof and ground
void printLine(int roofOrFoundation) { 
	for(int i = 0; i < 16; i++) {
		System.out.print((char)roofOrFoundation);
	}
	System.out.println();
}

// print one wall
void printWall(int wall) {
	System.out.print((char)wall);
}

//printing main part of the house: 2-7 floors
void printMain(int wall, int lw, int rw) {
	for(int j = 0; j < 6; j++ ) { // loop for printing 6 strings
	// printing left wall
	System.out.print((char)wall);
		// printing windows per floor
		for(int i = 0; i < 7; i++) { 
			// loop for printing 7 object with 2 symbols each one
			System.out.print((char)lw);
			System.out.print((char)rw);
		}
	// printing right wall
	System.out.print((char)wall); 
	System.out.println();
	}
}

//printing doors
void printDoors(int ld, int md, int rd) {
	// printing left part of the door
	System.out.print("     " + (char)ld); 	
	// printing central parts of the door
	System.out.print((char)md); 
	System.out.print((char)md);
	// printing right part of the door
	System.out.print((char)rd + "     ");	
}
}