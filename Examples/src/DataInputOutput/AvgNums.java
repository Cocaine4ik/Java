package DataInputOutput;

/* This program find average for numbers row
entered by user from keyboard */

import java.io.*;

public class AvgNums {
	public static void main(String atgs[]) throws IOException {
		  
	// create an object type BufferedReader,
	// using input stream System.in
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str;
	int n;
	double sum = 0.0;
	double avg, t;
	
	System.out.print("How many numbers will you enter: ");
	str = br.readLine();
	
	try {
	      // transform character string to 
	      // number type int.
		n = Integer.parseInt(str);
	}
	catch (NumberFormatException exc) {
		System.out.println("Invalid format");
		n = 0;
	}
	System.out.println("Enter " + n + " values.");
	
	for(int i = 0; i < n; i++) {
		System.out.println(" : ");
		str = br.readLine();
		
		try {
		      // transform character string to 
		      // number type double.
			t = Double.parseDouble(str);
		}
		catch (NumberFormatException exc) {
			System.out.println("Invalid format");
			t = 0.0;
		}
		sum += t;
	}
	avg = sum / n;
	System.out.println("Average is " + avg);
	}
}
