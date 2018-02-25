package DataTypesAndOperators;

//Демонстрация срока действия переменной

public class VarInitDemo {
	public static void main(String argh[]) {
		int x;
		for(x = 0; x < 3; x++) {
			int y = -1; // переменная у инициализируется при каждом входе в блок 
			System.out.println("y is " + y); // всегда выводится значение -1
			y = 100;
			System.out.println("у is now: " + y);
			
		}
	}

}
