package Recursion;

import java.util.Scanner;

// Akkerman function recursion

public class AkkermanFunc {
	
	public static int Afunc(int m, int n) {
        // Base case	
        if (m == 0) {
            return n + 1;
        } // Recursion step
        else if (n == 0 && m > 0) {
            return Afunc(m - 1, 1);
        } //Recursion step #2
        else {
            return Afunc(m - 1, Afunc(m, n - 1));
        }
    }
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	AkkermanFunc A = new AkkermanFunc();
    	int m, n;
    	
    	// check input if m >= 4
    	
    	do {System.out.print("Enter m (m can't 4 or more): ");
    		m = in.nextInt();
    	}
    	while(m >= 4);
    	
    	System.out.print("Enter n: ");
    	
    	n = in.nextInt();
    	
        System.out.println("Afunc is: " + Afunc(m, n)); 
    }
}
