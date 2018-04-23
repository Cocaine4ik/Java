package ExceptionHandling;
// generate exception 
public class ThrowDemo {
	public static void main(String args[]) {
		try {
			System.out.println("Before throw.");
			// exception generating
			throw new ArithmeticException();
		}
		catch (ArithmeticException exc) {
			// intercept exception 
			System.out.println("Exception caught.");
		}
		System.out.println("After try/catch block.");
	}
}
