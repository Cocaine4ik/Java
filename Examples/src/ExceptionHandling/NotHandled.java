package ExceptionHandling;
// Exception handling by Java Virtual Machine
public class NotHandled {
	public static void main(String args[]) {
		int nums[] = new int[4];
		
		System.out.println("Before exception is generated.");
		
		// try applying to array's border
		nums[7] = 10;
	}
}
