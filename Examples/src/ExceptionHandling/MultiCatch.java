package ExceptionHandling;

// Usage an option of multi-catching exceptions 
// Notice: to compile this code need JDK 7
// or later kit version

public class MultiCatch {
	public static void main(String args[]) {
		
		int a = 88, b = 0;
		int result;
		char chrs[] = { 'A', 'B', 'C' };
		
		for(int i = 0; i < 2; i++) {
			try {
				if(i == 0)
					// generate exception ArithmeticException
					result = a / b;
				else 
					// generate exception ArrayIndexOutOfBoundsException
					chrs[5] = 'X';
			}
			// in this operator catch organized catching of both exceptions
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception caught: " + e);
			}
		}
		System.out.println("After multi-catch.");
	}
}
