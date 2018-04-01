package MethodsAndClasses;

public class VariableSum {

	public static int SumVar(int ...n) {
		int result = 0;
		for(int i = 0; i < n.length; i++) {
			result += n[i];
		}
			return result;
	}
	public static void main(String args[]) {
		System.out.print(SumVar(10,20,30,50));
	}
}
