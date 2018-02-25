package DataTypesAndOperators;

/* Определение длины гипотенузы, исходя из длины катетов по теореме Пифагора. */

public class Hypot {
	
	public static void main(String argh[]) {
		
		double x, y, z;
		x = 3;
		y = 4;
		
		// Обратите внимание на вызов метода sqrt(). 
		// Перед именем метода указывается имя класса, членом которого он является.
		
		z = Math.sqrt(x*x+y*y);
		System.out.println("Гипотенуза равна " + z);
	}
}
