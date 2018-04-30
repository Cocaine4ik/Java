package DataInputOutput;

/* Copy text file.
 * When you calling this program you should indicate name of 
 * initial and target files. For example, to
 * copy file FIRST.TXT to fail SECOND.TXT
 * in command line need to indicate next:
 * java CopyFile FIRST.TXT SECOND.TXT */

import java.io.*;

public class CopyFile {
	public static void main(String args[]) {
		
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		
		// first of all, we must check if the file name is correct
		if(args.length !=2) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		// open initial file
		try { fin = new FileInputStream(args[0]); }
		catch (FileNotFoundException exc) {
			System.out.println("Input File Not Found");
			return;
		}
		
		// open target file
		try { fout = new FileOutputStream(args[1]); }
		catch (FileNotFoundException exc) {
			
		}
	}
}
