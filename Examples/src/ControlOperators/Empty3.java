package ControlOperators;

//“ело цикла for может быть пустым

public class Empty3 {
	public static void main(String argh []) {
		
		int i, sum = 0;
		
		// Ќесмотр€ на отсутствие тела в этом цикле
		// производитьс€ суммирование числе от 1 до 5
		
		for(i = 1; i <= 5; sum+=i++);
		System.out.println("Sum is" + sum);
	}
}

