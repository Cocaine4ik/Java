package DataInputOutput;

import java.io.*;
import java.io.RandomAccessFile;

// File random access demonstration

public class RandomAccessDemo {
	public static void main(String args[]) {
		
		double data [] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
		double d;
		
		// open and use fail with random access
		// file with random access is opening to read and write
		
		try (RandomAccessFile raf = new RandomAccessFile ("random.dat", "rw")) {
			
			// write values to fail
			for (int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);
			}
			
			// and now read separate values from file
			// To install file pointer served method seek()
			
			raf.seek(0); // find first value type double
			d = raf.readDouble();
			System.out.println("First value is " + d);
			
			raf.seek(8); // find second value type double
			d = raf.readDouble();
			System.out.println("Second value is " + d);
			
			raf.seek(8 * 3); // find fourth value type double
			d = raf.readDouble();
			System.out.println("Fourth value is " + d);
			
			System.out.println();
			
			// and now read values through one
			System.out.println("Here is every other value: ");
			for(int i = 0; i < data.length; i+=2) {
				raf.seek(8 * i); // find i value type double
				d = raf.readDouble();
				System.out.print(d + " ");
			}
		}
		catch (IOException exc) {
			System.out.println("I/O Error: " + exc);			
		}
	}
}
