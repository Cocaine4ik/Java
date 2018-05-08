package DataInputOutput;

/*
To use this program you must have JDK 7 or higher, indicate
names of compare files in command line, for example:
java CompFile FIRST.TXT SECOND.TXT
*/

import java.io.*;

public class CompFiles {
	public static void main(String args[]) {
		
		int i = 0, j = 0;
		
		// First of all u should making sure that files was indicated
		if(args.length != 2) {
			System.out.println("Usage: CompFiles fl f2");
			return;
		}
		
		// compare files
		try (FileInputStream f1 = new FileInputStream(args[0]);
				FileInputStream f2 = new FileInputStream(args[1])) {
			
			// check each file included
			do {
				i = f1.read();
				j = f2.read();
				if(i != j) break;
			}
			while(i != -1 && j != -1);
			
		if(i != j)
			System.out.println("Files differ.");
		else 
			System.out.println("Files are the same.");
	}
		catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}
