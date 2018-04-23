package ExceptionHandling;

// repeat exception generating

public class Rethrow {
	public static void genException() {
		
		// here arrays numer is longer then array denom
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		
		for(int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " is " +
				numer[i] / denom[i]);
				}
			catch (ArithmeticException exc) {
				// intercept exception
				System.out.println("Can11 divide by Zero!");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				// intercept exception
				System.out.println("No matching element found.");
                throw exc; // repeat exception generating
			}
		}
	}
}