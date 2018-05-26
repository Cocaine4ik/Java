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
				
				// and now check if themes are the same
				if(ch == '#') {
					topic = helpRdr.readLine();
					if(what.compareTo(topic) == 0) {
						// theme is not find
						do {
							info = helpRdr.readLine();
							if(info != null) System.out.println(info);
						}
						while ((info != null) && (info.compareTo("") != 0));
						return true;
					}
				}
			}
			while (ch != -1);
		}
		catch (IOException exc) {
			System.out.println("Error accessing help file.");
			return false;
		}
		return false; // theme not found
	}
	// receive message
	String getSelection() {
		
		String topic = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter topic: ");
		try {
			topic = br.readLine();
		}
		catch (IOException exc) {
			System.out.println("Error reading console.");
		}
		return topic;
	}
}
