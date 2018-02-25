package ControlOperators;

public class ContToLabel {
	
	public static void main(String argh[]) {
		
		outerloop: for(int i = 1; i < 10; i++) {
			System.out.print("\n Outer loop pass " + i + " Inner loop: ");
			for(int j = 1; j < 10; j++) {
				
				if(j==5)continue outerloop; // предложить внешний цикл
				
			System.out.print(j);
			}
		}
	}
}
