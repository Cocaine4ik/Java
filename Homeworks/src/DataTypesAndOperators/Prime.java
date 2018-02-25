package DataTypesAndOperators;

//Ќапишите программу, котора€ находила бы простые числа в пределах от 2 до 100.

public class Prime {
	public static void main(String argh[]) {
		boolean isprime;
		int i,j;
		for( i = 2; i <= 100; i++) {
			isprime = true;
			for(j = 2; j < i; j++) // реализаци€ j как i-1;
				if((i%j) == 0) isprime = false; // проверить делитьс€ ли простое число без остатка
			if(isprime) System.out.println(i + " is prime");
		}
			
		}
	}

