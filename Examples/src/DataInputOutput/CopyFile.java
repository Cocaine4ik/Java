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
			System.out.println("Error Opening Output File");
			// close initial file
		try { fin.close(); }
		catch (IOException exc2) {
			System.out.println("Error closing input file.");
		}
		return;
		}
		// copy file
				
		try {
			do {
			// Reading bytes from one file and write to another
				i = fin.read();
				if(i != -1) fout.write(i);
			}
			while(i != -1);
		}
		catch (IOException exc){
			System.out.println("File Error");
		}
		try { fin.close(); }
		catch (IOException exc) {
			System.out.println("Error closing input file.");
		}
		try { fout.close(); }
		catch (IOException exc) {
			System.out.println("Error closing output file.");
			try { fin.close(); }
			catch (IOException exc2) {
				System.out.println("Error closing input file.");
			}
			return;
				
			}
		// copy file
		try {
			do {
				// reading bytes from one file and writing to another file
				i = fin.read();
				if(i != -1) fout.write (i);
			}
			while(i != -1);
			}
		catch (IOException exc) {
			System.out.println("File Error");
		}
		try {
			fin.close();
		}
			catch (IOException exc) {
				System.out.println("Error closing input file.");
			}
			try {
				fout.close();
		}
			catch (IOException exc) {
				System.out.println("Error closing output file.");
			}
	}
}