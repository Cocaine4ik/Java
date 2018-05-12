package DataInputOutput;

// Reading characters line from console using class BufferedReader

import java.io.*;

public class ReadLines {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
	    System.out.println("Enter lines of text.");
	    System.out.println("Enter 'stop' to quit.");
	    
	    do {
	        // use to method readLine() from the class BufferedReader
	        // to read text line
	    	str = br.readLine();
	    	System.out.println(str);
	    }
	    while (!str.equals("stop"));
	}
}
