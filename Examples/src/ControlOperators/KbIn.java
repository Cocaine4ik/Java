package ControlOperators;

//������ ������� � ����������

public class KbIn {
	public static void main(String argh[]) throws java.io.IOException{
		
			char ch;
			System.out.println("Press a key followed by ENTER");
			// ���� ������� � ����������
			ch = (char) System.in.read();
			// �������� �������� ���� �har
			System.out.println("Your key is: " + ch);
			
		}
}
