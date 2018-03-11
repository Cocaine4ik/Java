package Beginner;

// using System.out.println() , program have to print right triangle using characters plus.
// +
// ++
// +++
// ++++
// +++++
// ++++++
// +++++++

public class RightTriangle {
	public static void main(String args[]) {

String p = "+";
		
		for(int i = 0; i < 6; i++) {
			System.out.print(p);

			
			if(i == 1) System.out.print("+");
			if(i == 2) System.out.print(p + p);
			if(i == 3) System.out.print(p + p + p);
			if(i == 4) System.out.print(p + p + p + p);
			if(i == 5) System.out.print(p + p + p + p + p);
			if(i == 6) System.out.print(p + p + p + p + p + p);
			
			System.out.println();
		}
	}

	

}
