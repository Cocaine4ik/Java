package MainOfJava;

public class IfDemo {
	
	/* Продемонстрировать применение оператора if. 
	 * Присвоить исходному файлу имя IfDemo.java. */
	
	public static void main(String argh[]) {
		
		int a,b,c;
		a = 2;
		b = 3;
		
		if(a < b)
			System.out.println("a is less then b");
		
		//следующая строка не должна выводится
		
		if(a == b)
			System.out.println("You won't see this");
			System.out.println();
			
		c = a - b; //переменная c содержит значение -1
		System.out.println("c contains -1");
			
			if(c >= 0)
				System.out.println("c is non-negative");
			
			if( c < 0)
				System.out.println("c is negative");
				System.out.println();
				
			c = b - a; //переменная c теперь содержит значение 1
			System.out.println("c contains 1");
			
			if(c >= 0)
				System.out.println("c is non-negative");
			
			if(c < 0)
				System.out.println("c is negative");	
	}
}