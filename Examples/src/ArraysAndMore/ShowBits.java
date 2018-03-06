package ArraysAndMore;

// transforming valuable type byte to binary format

public class ShowBits {
	public static void main(String args[]) {
		
	int t; 
	byte val;
	val = 123;
	
	for(t = 128; t > 0; t = t/2) {
		
		// val = 123 = 01111011
		// &
		// t = 128 =   10000000
		
		if((val & t) != 0)
			System.out.print(1);
		else
			System.out.print(0);
	}
	}
}
