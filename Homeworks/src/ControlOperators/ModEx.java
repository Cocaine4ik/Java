package ControlOperators;

//for with continue on module example 
public class ModEx {
	public static void main(String argh[]) {
		for (int i = 0; i<10; i++) {
			System.out.print(i + " ");
				if((i%2) == 0) continue;
				System.out.println();
			} 
	}
}

