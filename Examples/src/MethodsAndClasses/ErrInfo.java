package MethodsAndClasses;

public class ErrInfo {
	public static void main(String args[]) {
		
		Errorlnfo err = new Errorlnfo();
		Err e;
		
		e = err.getErrorInfo(2);
		System.out.println(e.msg + " severity: " + e.severity);
		
		e = err.getErrorInfo(3);
		System.out.println(e.msg + " severity: " + e.severity);
	}
}
