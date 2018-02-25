package ControlOperators;

//чтение вводимых данных до тех пор пока не будет получена буква q

public class Break2 {
	
	public static void main(String argh[]) throws java.io.IOException {
		
		char ch; // бесконечные цикл, завершающий с помощью оператора break
		
		for( ; ; ) {
			ch=(char)System.in.read();// ввести символ с клавиатуры
			if(ch=='q')break;			
		}
		System.out.println("You pressed q!");
	}
}