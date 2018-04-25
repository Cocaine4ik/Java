package Interfaces.qPack;

import ExceptionHandling.QueueFullException;

// interface for character queue

public interface ICharQ {
	
	// put symbol to queue
	void put(char ch) throws QueueFullException;
	
	// get symbol from the queue
	char get();
	
	// reset 
	void reset();
	
// А теперь попробуйте самостоятельно поупражняться в организации очередей.
// Создайте кольцевой вариант очереди DynQueue. Добавьте в интерфейс ICharQ метод reset(),
// устанавливающий очередь в исходное состояние. Создайте статический метод для копирования
// содержимого одной очереди в другую.
}
