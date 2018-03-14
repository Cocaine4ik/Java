package MethodsAndClasses;

// objects transfer to method by link

public class TestRef {

	int a, b;
	
	TestRef(int i, int j) {
		a = i;
		b = j;
	}
	
	// transfer object to method. Now variables ob.a and ob.b,
	// from transferring method, we can change
	
	void change(TestRef ob) {
		ob.a = ob.a + ob.b;
		ob.b = - ob.b;
	}
}
