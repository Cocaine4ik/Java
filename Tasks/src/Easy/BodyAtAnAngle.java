package Easy;

// Write a program, in which for known starting speed V and fly time of the body T identify angle Alpha
// under which body was thrown in relation to the horizon (use ratio a = arcsin(gT/2V) ).

public class BodyAtAnAngle {
	public static void main(String args[]) {
		
		int v = 60, t = 12;
		double angle, g = 9.8;
		
		System.out.println("V = " + v + "\n");
		System.out.println("T = " + t + "\n");
		
		angle = Math.asin( (g * t) / (2 * v)) * (90 / Math.asin(1.0));
		
		System.out.print("Angle: " + (int)angle);
	}
	
}
