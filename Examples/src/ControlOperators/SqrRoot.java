package ControlOperators;

//вывод квадратных корней числе от 1 до 99, с ошибкой округления

public class SqrRoot {
	public static void main(String argh[]) {
		
		double num, sroot, rerr;
		
		for(num = 1.0; num < 100.0; num++) {
			
			sroot = Math.sqrt(num);
			
			System.out.println("Square root of " + num + " is " + sroot);
			
			//вычислить ошибку округления
			
			rerr = num - (sroot * sroot);
			
			System.out.println("Rouding error is " + rerr);
			System.out.println();
		}
	}
}

