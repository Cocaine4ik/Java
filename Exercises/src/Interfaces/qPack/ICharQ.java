package Interfaces.qPack;

import ExceptionHandling.QueueEmptyException;
import ExceptionHandling.QueueFullException;

// interface for character queue

public interface ICharQ {
	
	// put symbol to queue
	void put(char ch) throws QueueFullException;
	
	// get symbol from the queue
	char get() throws QueueEmptyException;
	
	// reset 
	void reset();
	
// � ������ ���������� �������������� ������������� � ����������� ��������.
// �������� ��������� ������� ������� DynQueue. �������� � ��������� ICharQ ����� reset(),
// ��������������� ������� � �������� ���������. �������� ����������� ����� ��� �����������
// ����������� ����� ������� � ������.
}
