package DataInputOutput;

/* Copy text file.
 * When you calling this program you should indicate name of 
 * initial and target files. For example, to
 * copy file FIRST.TXT to fail SECOND.TXT
 * in command line need to indicate next:
 * java CopyFile FIRST.TXT SECOND.TXT */

import java.io.*;

public class CopyFile2 {
	public static void main(String args[]) {
		
		int i;
		
		// first of all, we must check if the file name is correct
		if(args.length !=2) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		// open initial file
		try (FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1]);) {
			
			do {
			// Reading bytes from one file and write to another
				i = fin.read();
				if(i != -1) fout.write(i);
			}
			while(i != -1);
		}
		catch (IOException exc){
			System.out.println("I/O Error: " + exc);
		}
	}
}