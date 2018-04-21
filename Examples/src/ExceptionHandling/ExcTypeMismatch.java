package ExceptionHandling;

// this program will not work correctly

public class ExcTypeMismatch {
	public static void main(String args[]) {
		int nums[] = new int[4];
		
		try {
			System.out.println("Before exception is generated.");
			
	        // When next operator is completing 
	        // exception ArraylndexOutOfBoundsException
			
			nums[7] = 10;
			System.out.println("this won’t be displayed");
		}
		
		/* Exception, connect with applying out of the border array,
        can't be complete with help of operator catch, in which
        is pointed exception type ArithmeticException. */
		
		catch(ArithmeticException exc) {
			System.out.println("Index out-of-bounds!");
		}
		System.out.println("After catch statement.");
	} 
}
