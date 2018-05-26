package DataUnputOutput;

/* Copying text file with spaces replacing to hyphen 

In current version of program using  byte flows.

To use this program indicate in command line
names of source and target files. For example:
java Hyphen source target
*/
import java.io.*;
import java.util.Scanner;

public class Hyphen {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		FileInputStream fin;
		FileOutputStream fout;
		int i;
		
		// open source file
		System.out.println("\nEnter source file name:");
		try {
			fin  = new FileInputStream(in.nextLine());
		}
		catch(FileNotFoundException exc) {
			System.out.println("Input File Not Found");
			return;
		}
		
		// open target file
		System.out.println("\nEnter target file name:");
		try {
			fout = new FileOutputStream(in.nextLine());
		}
		catch(FileNotFoundException exc) {
			System.out.println("Error Opeining Output File");
		try { fin.close(); }
		catch(IOException exc2) {
			System.out.println("Error closing input file.");
		}
		return;
		}
		// copy file
		System.out.println("\nCopying...");
		try {
			do {
				i = fin.read();
				if((char)i == ' ') i = '-';
				if(i != -1) fout.write(i);
			}
			while(i != -1);
		}
		catch(IOException exc) {
			System.out.println("File Error");
		}
		try { fin.close(); }
		catch(IOException exc) {
			System.out.println("Error closing intput file.");
		}
		try {fout.close(); }
		catch(IOException exc) {
			System.out.println("Error closing  target file");
		}
		System.out.println("\n...Done!");
	}
}
