package BitwiseOperations;

// transforming lower case letters to upper case letters 

public class UpCase {
	public static void main(String args[]) {
	
	char ch;
	
	for(int i = 0; i < 10; i++) {
		ch = (char)('a' + i); // a = 97; 97 = 1100001;
		System.out.print(ch);
		
		// in next operation we are dropping the sixth bit
		// after that variable ch will include code of the upper case letter
		// 97 - 32 || 1"0"00001; 
		
		ch = (char)((int) ch & 65503); 
		
		// ch = 	         1100001
		// &
		// 65503 = 	1111111111011111
		// = 		0000000001000001 = 65
		// if a(char) = 65 = 'A'
		
		System.out.print(ch + " ");
	}
	}
}
