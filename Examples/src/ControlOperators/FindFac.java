package ControlOperators;

//Use nested loop for identification of factors of numbers from 2 to 100

public class FindFac {
	public static void main(String argh[]) {
		for(int i=2; i<=100; i++) {
			System.out.print("Fartors of " + i + ": ");
			for(int j=2; j<i; j++)
				if((i%j)==0)
					System.out.print(j + " ");
					System.out.println();
		}
	}
}

