package Beginner;

// Program must paint house, building materials are: character of slash (straight /,
// back , vertical |), minus, and underscore. Use control characters.

public class CodeHome {
	public static void main(String args[]) {
		
		String house = "House:";
		char s = 47; // straight slash
		char bs = 92; // backslash
		char m = 45; // minus
		char vs = 124; // vertical slash
		char us = 95; // underscore
		
		System.out.println("\t" + "\0" + "\0" + "\0" + "\0" + "\0" + "\0" + house + "\n");
		System.out.println("\t" + "\t" + s + bs);
		System.out.println("\t" + "\0" + "\0" + "\0" + "\0" + "\0" + "\0" + "\0" + s + "\0" + "\0" + bs);
		System.out.println("\t" + "\0" + "\0" + "\0" + "\0" + "\0" + "\0" + s + "\0" + "\0" + "\0" + "\0" + bs);
		System.out.println("\t" + "\0" + "\0" + "\0" + "\0" + "\0" + s + m + m + m + m + m + m + bs);
		System.out.println("\t" + "\0" + "\0" + "\0" + "\0" + s + "\0" + vs + "\0" + "\0" + "\0" + "\0" +
		vs + "\0" + bs);
		System.out.println("\t" + "\0" + "\0" + "\0" + "\0" + "\0" + "\0" + vs + "\0" + "\0" + "\0" + "\0" + vs);
		System.out.println("\t" + "\0" + "\0" + "\0" + "\0" + "\0" + "\0" + vs + "\0" + "\0" + "\0" + "\0" + vs);
		System.out.println("\t" + "\0" + "\0" + "\0" + "\0" + "\0" + "\0" + vs + us + us + us + us + vs);
		
	}
}
