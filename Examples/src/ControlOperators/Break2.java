package ControlOperators;

//������ �������� ������ �� ��� ��� ���� �� ����� �������� ����� q

public class Break2 {
	
	public static void main(String argh[]) throws java.io.IOException {
		
		char ch; // ����������� ����, ����������� � ������� ��������� break
		
		for( ; ; ) {
			ch=(char)System.in.read();// ������ ������ � ����������
			if(ch=='q')break;			
		}
		System.out.println("You pressed q!");
	}
}