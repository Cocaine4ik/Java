package DataInputOutput;

// Simple example utility if input from keyboard and data output
// to disk, demonstrating usage class FileWriter.

import java.io.*;

public class Ktod {
	public static void main(String args[]) {
		
		String str;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter text('q' to quit).");
		
		// creating data input type FileWriter
		try (FileWriter fw = new FileWriter("test.txt")) {
			do {System.out.print(": ");
			str = br.readLine();
			if(str.compareTo("stop") == 0) break;
				str = str + "\r\n"; // add new line
			// writing text lines in to file
				fw.write(str);
			}
			while(str.compareTo("q") != 0);
		}
		catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}
