package HouseBuilding;

import java.util.Scanner;

public class Interface {

// create new Scanner and return link for him	
Scanner in = new Scanner(System.in); 		
// create new object House and return link for him
House home = new House();	
	
// Greeting new user
void greeting() {
	System.out.println("Now u can build u own house!");
	System.out.println("Let's choose structures to your house.");
	System.out.println();	
}

void chooseRoof(Scanner in, int roof) {
	for( ; ; ) {
		System.out.println("Choose your roof material:");
		System.out.println("Default roof - 45 \t Tile roof - 95 \t Slate roof - 126");
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
		
		if (input.equals("45") || input.equals("95") || input.equals("126")) {
			roof = Integer.parseInt(input);
			break;
		}
		else {
			System.out.println("Your enter wrong number. Pls choose the material and "
					+ "use his number.");
			System.out.println();
			continue;
		}
	}		
}

void chooseWall(Scanner in, int wall) {
	for( ; ; ) {
		System.out.println("Choose your wall style:");
		System.out.println("Default wall - 124 \t Ancint wall - 73 \t Modern wall - 33");
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
			break;
		}
		else {
			System.out.println("Your enter wrong number. Pls choose the style and "
					+ "use his number.");
			System.out.println();
			continue;
		}
	}		
}
}
