package ArraysAndMore;

// transforming upper case letters to lower case letters 

public class LowCase {
	public static void main(String args[]) {
	
		char ch;
		
		for(int i = 0 ; i < 10; i++) {
			ch = (char)('A' + i); // a = 65; 65 = 1000001
			System.out.print(ch);
			
			ch = (char)((int)ch | 32);
			
			// a = 65 = 1000001
			// |
			// 32 =     0100000
			// =		1100001 = 96 
			// if a(char) = 96 = 'a'
			
			System.out.print(ch + " ");
		}
		
	}
}
