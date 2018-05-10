package DataInputOutput;

// Usage class BufferedReader for reading characters from console

import java.io.*;

public class ReadChars {
	public static void main(String args[]) throws IOException {
		char c;
		
	    // Creating object type BufferedReader, connecting
	    // with standard data input System.in.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter characters, period to quit");
		
		// read characters 
		do {
			c = (char)br.read();
			System.out.println(c);
		}
		while(c != '.');
	}
}
