package DataTypesAndOperators;

//�������� ���������, ������� �������� �� ������� ����� � �������� �� 2 �� 100.

public class Prime {
	public static void main(String argh[]) {
		boolean isprime;
		int i,j;
		for( i = 2; i <= 100; i++) {
			isprime = true;
			for(j = 2; j < i; j++) // ���������� j ��� i-1;
				if((i%j) == 0) isprime = false; // ��������� �������� �� ������� ����� ��� �������
			if(isprime) System.out.println(i + " is prime");
		}
			
		}
	}

