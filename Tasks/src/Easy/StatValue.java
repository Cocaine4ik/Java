package Easy;

import java.util.Scanner;

// Calculate statement value according to this function(all variables accept only actual values):
// (1-tg x)^(ctg x)+ cos(x-y).

public class StatValue {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		double x, y, pi = 3.141592, answer;
		
		// entering x and y value by user
		
		System.out.println("Enter value x: ");
		x = in.nextInt();
		System.out.println("Enter value y: ");
		y = in.nextInt();
		
		// transform to radian
		
		x = x * pi / 180;
		y = y * pi / 180;
		
		// calculating function
		
		answer = Math.pow ( (1 - Math.tan(x)) , (1.0 / Math.tan(x)) ) + Math.cos(x - y);
		
		// show an answer
		
		System.out.println("Answer: " + (float)answer);
		
	}
}
