package MainOfJava;

public class IfDemo {
	
	/* ������������������ ���������� ��������� if. 
	 * ��������� ��������� ����� ��� IfDemo.java. */
	
	public static void main(String argh[]) {
		
		int a,b,c;
		a = 2;
		b = 3;
		
		if(a < b)
			System.out.println("a is less then b");
		
		//��������� ������ �� ������ ���������
		
		if(a == b)
			System.out.println("You won't see this");
			System.out.println();
			
		c = a - b; //���������� c �������� �������� -1
		System.out.println("c contains -1");
			
			if(c >= 0)
				System.out.println("c is non-negative");
			
			if( c < 0)
				System.out.println("c is negative");
				System.out.println();
				
			c = b - a; //���������� c ������ �������� �������� 1
			System.out.println("c contains 1");
			
			if(c >= 0)
				System.out.println("c is non-negative");
			
			if(c < 0)
				System.out.println("c is negative");	
	}
}