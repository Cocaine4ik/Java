package ControlOperators;

//Пропуск отдельных частей в опредлении цикла for

public class Empty {
	public static void main(String argh[]) {
		
		int i; // в определини єтого цикла отсутствует интерационное выражение;
		
		for(i = 0; i < 10; ) {
			System.out.println("Pass # " + i);
			
			i++; // инкременировать переменную управления циклом
		}
	}
}
