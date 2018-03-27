package MethodsAndClasses;


// —оздайте класс Stack, реализующий стек дл€ хранени€ символов. 
// »спользуйте методы push() и pop() дл€ манипулировани€ содержимым стека. 
// ѕользователь класса Stack должен иметь возможность задавать размер стека при его создании.
// ¬се члены класса Stack, кроме методов push() и pop(), должны быть объ€влены как private.
// (.ѕодсказка: в качестве заготовки можете воспользоватьс€ классом Queue, изменив в нем лишь способ доступа к данным.)

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
