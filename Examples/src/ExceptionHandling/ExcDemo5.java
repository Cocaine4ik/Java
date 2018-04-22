package ExceptionHandling;

// in operators catch exception type subclass must
// going before superclass

public class ExcDemo5 {
	public static void main(String args[]) {
		// here arrays numer is longer then array denom
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		
		for(int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " is " +
				numer[i] / denom[i]);
				}
			// intercept exception
			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("No matching element found.");
			}
			// intercept exception from superclass
			catch (Throwable exc) {
				System.out.println("Some exception occurred.");
			}
		}
	}
}
