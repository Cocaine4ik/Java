package MethodsAndClasses;


// �������� ����� Stack, ����������� ���� ��� �������� ��������. 
// ����������� ������ push() � pop() ��� ��������������� ���������� �����. 
// ������������ ������ Stack ������ ����� ����������� �������� ������ ����� ��� ��� ��������.
// ��� ����� ������ Stack, ����� ������� push() � pop(), ������ ���� ��������� ��� private.
// (.���������: � �������� ��������� ������ ��������������� ������� Queue, ������� � ��� ���� ������ ������� � ������.)

public class Stack {

	private char stck[];
	private int top;
	private int size;
	

	
	Stack(int size) {
	
		this.size = size;
		stck = new char[size];
		top = -1;
	}

	public void push(char ch) {
		stck [++top] = ch;
	}
	
	public void pop(char ch) {
		stck [top--] = ch;		
	}
	
	public void isEmpty() {
		if(top == -1)
			System.out.println("Array is empty!");
	}
	
	public boolean isFull() {
		return (size == stck.length - 1);
			
	}
	
	
}
