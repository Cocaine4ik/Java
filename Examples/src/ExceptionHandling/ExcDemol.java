package ExceptionHandling;
// exception handling demonstration
public class ExcDemol {
	public static void main(String args[]) {
		int nums[] = new int[4];
		
		// creating block try
		try {
			System.out.println("Before exception is generated.");
			
			// try applying to array's border
			nums[7] = 10;
			System.out.println("This won't be displayed");
		}
		// Intercept exception in connection with arrays applying abroad
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Index out-of-bounds!");		
		}
		  System.out.println("After catch statement.");
	}
}
