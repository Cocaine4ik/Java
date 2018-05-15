package DataInputOutput;

/* Exercise #10.2.

Reference system, located on disk

To compile this program need JDK 7
or higher version */

/* In the class Help openings fail with reference information,
making search to theme name, then shows
reference information for this theme.
Pay attention, in this class is supporting
all exceptions, relieving of this duty calling code. */

import java.io.*;

public class Help {
	
	String helpfile; // name of the file with reference system
	
	Help(String fname) {
		helpfile = fname;
	}
	
	// show reference information for given theme
	boolean helpon(String what) {
		
		int ch;
		String topic, info;
		
		// open reference file
		try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
			do {
				ch = helpRdr.read();
			}
		}
		catch (IOException exc) {
			System.out.println("Error accessing help file.");
			return false;
		}
	}
}
