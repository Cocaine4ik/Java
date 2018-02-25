package ControlOperators;

//Применение запятых в операторе цикла for.

public class Comma {
	public static void main(String argh[]) {
		
		int i, j; // дял управления этим циклом используются 2 переменные
		
		for (i = 0, j = 10; i < j; i++, j--)
			System.out.println("i and j: " + i + " " + j);
	}
}

