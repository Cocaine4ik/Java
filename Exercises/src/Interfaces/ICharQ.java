package Interfaces;

// interface for character queue

public interface ICharQ {
	
	// put symbol to queue
	void put(char ch);
	
	// get symbol from the queue
	char get();
	
	// reset 
	void reset();
	
// � ������ ���������� �������������� ������������� � ����������� ��������.
// �������� ��������� ������� ������� DynQueue. �������� � ��������� ICharQ ����� reset(),
// ��������������� ������� � �������� ���������. �������� ����������� ����� ��� �����������
// ����������� ����� ������� � ������.
}
