package ControlOperators;

//ѕрименение оператора continue

public class ContDemo {
	public static void main(String argh[]) {
		
		int i; // вывести четные числа в пределах от 0 до 100
		
		for(i = 0; i <= 100; i++) {
			
			if((i%2)!=0) continue; // завершить шаг итеррации цикла
			
			System.out.println(i);
		}
	}
}

