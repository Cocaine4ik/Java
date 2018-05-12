package DataInputOutput;

// Simple utility input from disk and output to screen
// demonstrating usage class FileReader.

import java.io.*;

public class DtoS {
	public static void main(String args[]) {
		
		String s;
		
		// Creating in class BufferedReader a sheath in with target to conclude in
	    // class FileReader and organize data reading from fail.
		
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}
		catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}
