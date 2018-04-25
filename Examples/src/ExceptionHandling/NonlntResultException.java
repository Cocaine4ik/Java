package ExceptionHandling;

// special created exception usage

public class NonlntResultException extends Exception {

	int n;
	int d;
	
	NonlntResultException (int i, int j) {
		n = i;
		d = j;
	}
	
	public String toString() {
		return "Result of " + n + " / " + d + " is non-integer";
	}
}
