package MethodsAndClasses;

// simple data types  are transferring to methods by values

public class Test {
	
	// this method can't change value of the arguments transferring him when he calls
	
	void noChange(int i, int j) {
		i = i + j;
		j = -j;
	}
}
