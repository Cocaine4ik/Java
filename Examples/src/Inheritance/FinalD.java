package Inheritance;

public class FinalD {
	public static void main(String args[]) {
		
		ErrorMsg err = new ErrorMsg();
		
		// when we use method we use constants
		// announced with the key word final
		
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.DISKERR));
	}
}
