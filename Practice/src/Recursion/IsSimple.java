package Recursion;

public class IsSimple {

	boolean IsItSimple(int n, int i) {
		
		if (n < 2) return false;
		else if (n == 2) return true;
		else if (n % i == 0) return false;
		else if (i < n / 2) return IsItSimple(n, i + 1);
		else return true;
	}
	public static void main(String args[]) {
		
	}
}
