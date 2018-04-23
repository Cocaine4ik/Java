package ExceptionHandling;

class RethrowDemo {
	public static void main(String args[]) {
		try {
			Rethrow.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// intercepting repeat generated exception
            System.out.println("Fatal error - " +
                               "program terminated.");
		}
	}
}
