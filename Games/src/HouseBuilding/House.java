package HouseBuilding;

public class House implements Building {
	
	int roof; // roof
	int wall; // wall
	int leftWindow; // left part of the window
	int rightWindow; // right part of the window
	int foundation; // foundation
	int leftDoor; // left door part
	int rightDoor; // right door part
	int middleDoor; // middle door

	House(int r, int w, int lw, int rw, int f, int ld, int rd, int md ) {
		roof = r;
		wall = w;
		leftWindow = lw;
		rightWindow = rw;
		foundation = f;
		leftDoor = ld;
		rightDoor = rd;
		middleDoor = md;
	}
	
	public void print(int stuff, int count) {
		for(int i = 0; i <= count; i++) {
			System.out.print((char)stuff);
		}
		System.out.println();
	}
	public void printMain(int ) {
		print()
	}
	int getRoof() { return roof; }
	void setRoof(int r) { roof = r; }
	
	int getWall() { return wall; }
	void setWall(int w) {wall = w; }
	
	int getLeftWindow() { return leftWindow; }
	void setLeftWindow(int lw) { leftWindow = lw; }
	
	int getRightWindow() { return rightWindow; }
	void setRightWindow(int rw) {rightWindow = rw; }
	
	int getFoundation() { return foundation; }
	void setFoundation(int f) { foundation = f; }
	
	int getLeftDoor() { return leftDoor; }
	void setLeftDoor(int ld) {leftDoor = ld; }
	
	int getRightDoor() { return rightDoor; }
	void setRightDoor(int rd) { rightDoor = rd; }
	
	int getMiddleDoor() { return middleDoor; }
	void setMiddleDoor(int md) { middleDoor = md; }
	
	
	

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

void greeting() {
	System.out.println("Now you can build your own house!");
	System.out.println("Let's choose structures to your house.");
	System.out.println();	
}

int chooseRoof(int roof) {
	for( ; ; ) {
		System.out.println("Choose your roof style:");
		System.out.println("Default roof - 45 \t Tile roof - 94 \t Slate roof - 126");
		System.out.println("Enter a number of the choosen style:");
		String input = in.nextLine();
		
		// checking input, if input is empty, warn user about it
		// and ask to try again, after that - continue loop.
						
		if(input.isEmpty()) {
			System.out.println("You don't enter anything.");
			System.out.println();
			continue;
		}
		
		// checking input, if input have any characters, warn user about it
		// and ask to try again, after that - continue loop.
		
		if(!input.matches("[-+]?\\d+")){
			System.out.println("The number must consists only numerals.");
			System.out.println();
			continue;
		}
		
		if (input.equals("45") || input.equals("94") || input.equals("126")) {
			roof = Integer.parseInt(input);
			System.out.println();
			return roof;
		}
		else {
			System.out.println("Your enter wrong number. Pls choose the material and "
					+ "use his number.");
			System.out.println();
			continue;
		}
	}
	
}

int chooseWall(int wall) {
	for( ; ; ) {
		System.out.println("Choose your wall style:");
		System.out.println("Default wall - 124 \t Ancient wall - 73 \t Modern wall - 33");
		System.out.println("Enter a number of the choosen style:");
		String input = in.nextLine();
		
		// checking input, if input is empty, warn user about it
		// and ask to try again, after that - continue loop.
						
		if(input.isEmpty()) {
			System.out.println("You don't enter anything.");
			System.out.println();
			continue;
		}
		
		// checking input, if input have any characters, warn user about it
		// and ask to try again, after that - continue loop.
		
		if(!input.matches("[-+]?\\d+")){
			System.out.println("The number must consists only numerals.");
			System.out.println();
			continue;
		}
		
		if (input.equals("124") || input.equals("73") || input.equals("33")) {
			wall = Integer.parseInt(input);
			System.out.println();
			return wall;
		}
		else {
			System.out.println("Your enter wrong number. Pls choose the style and "
					+ "use his number.");
			System.out.println();
			continue;
		}
	}		
}

int chooseWindows(int lw) {
	for( ; ; ) {
		System.out.println("Choose your windows style:");
		System.out.println("Default windows - 91 \t Circle windows - 40 \t Old windows - 60");
		System.out.println("Enter a number of the choosen style:");
		String input = in.nextLine();
		
		// checking input, if input is empty, warn user about it
		// and ask to try again, after that - continue loop.
						
		if(input.isEmpty()) {
			System.out.println("You don't enter anything.");
			System.out.println();
			continue;
		}
		
		// checking input, if input have any characters, warn user about it
		// and ask to try again, after that - continue loop.
		
		if(!input.matches("[-+]?\\d+")){
			System.out.println("The number must consists only numerals.");
			System.out.println();
			continue;
		}
		
		if (input.equals("91") || input.equals("40") || input.equals("60")) {
			lw = Integer.parseInt(input);
			System.out.println();
			return lw;
		}
		else {
			System.out.println("Your enter wrong number. Pls choose the style and "
					+ "use his number.");
			System.out.println();
			continue;
		}
	}		
}
int windows(int lw){
	switch(lw) {
	case 91: lw = 93; break;
	case 40: lw = 41; break;
	case 60: lw = 62; break;
	}
	return lw;
}

int chooseDoors(int ld) {
	for( ; ; ) {
		System.out.println("Choose your doors style:");
		System.out.println("Default doors - 123 \t Rich doors - 47 \t Metal doors - 124");
		System.out.println("Enter a number of the choosen style:");
		String input = in.nextLine();
		
		// checking input, if input is empty, warn user about it
		// and ask to try again, after that - continue loop.
						
		if(input.isEmpty()) {
			System.out.println("You don't enter anything.");
			System.out.println();
			continue;
		}
		
		// checking input, if input have any characters, warn user about it
		// and ask to try again, after that - continue loop.
		
		if(!input.matches("[-+]?\\d+")){
			System.out.println("The number must consists only numerals.");
			System.out.println();
			continue;
		}
		
		if (input.equals("123") || input.equals("47") || input.equals("124")) {
			ld = Integer.parseInt(input);
			return ld;
		}
		else {
			System.out.println("Your enter wrong number. Pls choose the style and "
					+ "use his number.");
			System.out.println();
			continue;
		}
	}		
}
int doors(int ld){
	switch(ld) {
	case 123: ld = 125; break;
	case 47: ld = 92; break;
	case 124: ld = 124; break;
	}
	return ld;
}

int chooseFoundation(int foundation) {
	for( ; ; ) {
		System.out.println("Choose your foundation style:");
		System.out.println("Default foundation - 45 \t Great foundation - 35 \t Old foundation - 119");
		System.out.println("Enter a number of the choosen material:");
		String input = in.nextLine();
		
		// checking input, if input is empty, warn user about it
		// and ask to try again, after that - continue loop.
						
		if(input.isEmpty()) {
			System.out.println("You don't enter anything.");
			System.out.println();
			continue;
		}
		
		// checking input, if input have any characters, warn user about it
		// and ask to try again, after that - continue loop.
		
		if(!input.matches("[-+]?\\d+")){
			System.out.println("The number must consists only numerals.");
			System.out.println();
			continue;
		}
		
		if (input.equals("45") || input.equals("35") || input.equals("119")) {
			foundation = Integer.parseInt(input);
			return foundation;
		}
		else {
			System.out.println("Your enter wrong number. Pls choose the material and "
					+ "use his number.");
			System.out.println();
			continue;
		}
	}
	
}
}