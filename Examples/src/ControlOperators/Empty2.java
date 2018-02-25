package ControlOperators;

//Пропуск дополнительных частей в опредлении цикла for

public class Empty2 {
	public static void main(String argh[]) {
		int i;
		
		// Из опредления этого цикла исключено не только итерационное выражение,
		// но и инициализирующее выражений
		
		i = 0;
		for( ; i < 10; ) {
			System.out.println("Pass # " + i);
			
			i++; // инкременировать переменную управения циклом
			
		}
	}
}

