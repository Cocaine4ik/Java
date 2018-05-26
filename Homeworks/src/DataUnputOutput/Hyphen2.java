package DataUnputOutput;

/* Copying text file with spaces replacing to hyphen 

In current version of program using  byte flows.

To use this program indicate in command line
names of source and target files. For example:
java Hyphen source target
*/
import java.io.*;
import java.util.Scanner;

public class Hyphen2 {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		String f1, f2;
		int i;
		
		System.out.println("\nEnter source file name:");
		f1 = in.nextLine();
		System.out.println("\nEnter target file name:");
		f2 = in.nextLine();
		
		
		try ( FileReader fin = new FileReader(f1);
				FileWriter fout = new FileWriter(f2)) {
			System.out.println("\nCopying...");
			do {
				i = fin.read();
				if((char)i == ' ') i = '-';
				if(i != -1) fout.write(i);
			}
			while(i != -1);
			System.out.println("\n...Done!");
			}
		catch(IOException exc) {
			System.out.println("I/O Error: ");
		}
	}
}
