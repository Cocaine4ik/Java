package DataInputOutput;

import java.io.*;

// read bytes from keyboard to array

public class RedBytes {
	public static void main(String args[]) throws IOException{
		byte[] data = new byte[10];
		
		System.out.println("Enter some characters.");
		
		// read data entered from keyboard
		// and put in to array
		
		System.in.read(data);
		System.out.print("You entered: ");
		
		for(int i = 0; i < data.length; i++)
			System.out.print((char)data[i]);
	}
}
