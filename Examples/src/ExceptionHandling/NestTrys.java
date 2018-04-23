package ExceptionHandling;

// inner block try usage

public class NestTrys {
	public static void main(String args[]) {
	
		// array numer is longer then array denom
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		
		// inner blocks try
		try { // outer block try
			
			for(int i=0; i<numer.length; i++) {
				
				try { // inner block try
					
					System.out.println(numer[i] + " / " + denom[i] + " is " +
							numer[i] / denom[i]);					
				}
				catch (ArithmeticException exc) {
					// intercept exception
					System.out.println("Can't divide by Zero!");
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// intercept exception
            System.out.println("No matching element found.");
            System.out.println("Fatal error - program terminated.");
		}
	}
}
