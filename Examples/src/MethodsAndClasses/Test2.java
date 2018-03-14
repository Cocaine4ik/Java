package MethodsAndClasses;

// objects transfer to method by link

public class Test2 {

	int a, b;
	
	Test2(int i, int j) {
		a = i;
		b = j;
	}
	
	// transfer object to method. Now variables ob.a and ob.b,
	// from transferring method, we can change
	
	void change(Test2 ob) {
		ob.a = ob.a + ob.b;
		ob.b = - ob.b;
	}
}
