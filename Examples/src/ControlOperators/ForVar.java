package ControlOperators;

//Обьявление переменной и управление циклом в самом цикле for

public class ForVar {
	public static void main(String argh[]) {
		
		int sum = 0;
		int fact = 1;
		
		// Вычисление факториала числе от 1 до 5
		// Переменная управления обьявляется в этом цикле for
		
		for(int i = 1; i <= 5; i++) {
			sum+=i;
			
			// Она доступна во всем цикле
			
			fact *=i;
		}
		
		// Но недоступна за пределами функции
		
		System.out.println("Sum is " + sum);
		System.out.println("Factorial is " + fact);
	}
}

