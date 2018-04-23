package ExceptionHandling;
// usage methods from class Throwable
public class UseThrowableMethods {
	public static void main(String args[]) {
		try {
			ExcTest.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// intercept exception
			System.out.println("Standard message is: ");
			System.out.print(exc);
			System.out.println("\nStack trace: ");
			exc.printStackTrace();
		}
		System.out.println("After catch statement.");
	}
}
