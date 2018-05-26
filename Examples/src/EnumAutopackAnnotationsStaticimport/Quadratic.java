package EnumAutopackAnnotationsStaticimport;

// Solution of quadratic equation 

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Quadratic {
	public static void main(String args[]) {
		
		// variables a, b and c are designating indexes
		// of the quadratic equation ax2 + bx + c = 0
		
		double a, b, c, x;
		
		// solve quadratic equation 4x2 + x -3 = 0;
		
		a = 4;
		b = 1;
		c = -3;
		
		// Find first solution
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution: " + x);
		
		// Find second solution
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Second solution: " + x);
		
	}
}
