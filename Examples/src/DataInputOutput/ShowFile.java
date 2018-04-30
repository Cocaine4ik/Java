package DataInputOutput;

import java.io.*;


/* show text fail
When u calling program u must point file name,
which you need to watch.
For example, to display data of the fail TEST.TXT,
in command line u must enter next:
java ShowFile TEST.TXT
*/

public class ShowFile {
	public static void main(String args[]) {
		int i;
		FileInputStream fin;
		// first of all, we must check if the file name is correct
		if(args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}
		try {
			// opening fail
			fin = new FileInputStream(args[0]);
		}
		catch(FileNotFoundException exc) {
			System.out.println("File not found");
			return;
		}
		try {
		// read file until meet character EOF
		do {
			i = fin.read();
			if(i != -1) System.out.print((char) i);
			// if variable i value = -1, so
			// the file is ended.
		}
		while( i != -1);
		}
		catch(IOException exc) {
			System.out.println("Error reading file.");
		}
		finally {
			try {
				// closing file
				fin.close();
			}
			catch(IOException exc) {
				System.out.println("Error closing file.");
			}
		}
	}
}
