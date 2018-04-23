package ExceptionHandling;

// finally bloc usage

public class UseFinally {
	public static void getException(int what) {
		
		int t;
		int nums[] = new int[2];
		
		System.out.println("Receiving " + what);
		try {
			switch(what) {
			
			case 0: t = 10 / what; // generate error division by zero
			break;
			
			case 1: nums[4] = 4; // generate error applying to array
			break;
			
			case 2: return; // return from block try
			}
		}
		catch (ArithmeticException exc) {
			// intercept exception
            System.out.println("Can't divide by Zero!");
            return; // return from block catch
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// intercept exception
			System.out.println("No matching element found.");
		}
		// this block completing not depends on end block try/catch
		finally {
			System.out.println("Leaving try.");
		}
	}
}
