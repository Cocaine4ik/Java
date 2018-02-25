package DataTypesAndOperators;

public class PromDemo {
	
	public static void main(String argh[]) {
		
		byte b;
		int i;
		b = 10;
		
		// В данном случае приведение типов не требуется, так как
		// результат вычисления выражения уже относится к типу int.
		
		i = b * b;
		b = 10;
		
		// А в этом случае приведение типов требуется для 
		// присваивания значения int переменной типа byte!
		
		b = (byte)(b*b); // cast needed!!
		System.out.println("a and b: " + i + " " +b);
	}

}
