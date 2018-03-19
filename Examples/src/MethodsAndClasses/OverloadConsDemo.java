package MethodsAndClasses;

// example for MyConstr

public class OverloadConsDemo {
	public static void main(String args[]) {
		
		MyConstr t1 = new MyConstr();
		MyConstr t2 = new MyConstr(88);
		MyConstr t3 = new MyConstr(17.23);
		MyConstr t4 = new MyConstr(2, 4);
		
		System.out.println("t1.x: " + t1.x);
		System.out.println("t1.x: " + t2.x);
		System.out.println("t1.x: " + t3.x);
		System.out.println("t1.x: " + t4.x);
	}
}
