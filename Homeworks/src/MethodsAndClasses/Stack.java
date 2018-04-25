package MethodsAndClasses;

import ExceptionHandling.StackIsEmptyException;
import ExceptionHandling.StackIsFullException;

// Create class Stack, realized stack for storage characters. 
// Use methods push() è pop() to control stack includes. 
// Stack class user must has an opportunity to enter stack size himself.
// All members of the class Stack, besides methods push() and pop(), must be private.

public class Stack {

	private char stck[]; // arrays for storage characters
	private int top; // top point in stack
	public int size; // array size	
	
	// stack constructor
	
	Stack(int m) {
	
		size = m;
		stck = new char[size];
		top = 0; // if top is 0, we can understand that stack if empty,
		// else stack have 1 more elements
	}

    // push characters to stack
    void push(char ch) throws StackIsFullException{
        if(top == stck.length)
        	throw new StackIsFullException(stck.length - 1);
        stck[top] = ch;
        top++;
    }

    // extract symbols from stack
    
    char pop() throws StackIsEmptyException{
        if(top == 0)
        	throw new StackIsEmptyException();
        top--;
        return stck[top];
    }
	
    // show top stack point element
    
    char readTop() {
		return stck[top];
    	
    }
}
