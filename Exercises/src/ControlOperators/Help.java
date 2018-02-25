package ControlOperators;

/* В этом проекте предстоит создать простую справочную систему,
 * предоставляющую сведения о синтаксисе управляющих операторов Java.
 * Программа, реализующая эту справочную систему, отображает меню
 * с названиями операторов и ожидает выбора одного из них.
 * Как только пользователь выберет один из пунктов меню,
 * на экран будут выведены сведения о синтаксисе соответствующего оператора.
 * В первой версии данной программы предоставляются сведения только об операторах if и switch.
 * А в последующих проектах будут добавлены справочные данные об остальных управляющих операторах. */

public class Help {
	public static void main(String argh[]) throws java.io.IOException {
		char choice;
		System.out.println("Help on");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("Choose one");
		choice = (char) System.in.read();
		switch(choice){
			case '1': 
				System.out.println("The if:\n");
				System.out.println("if(condition)statement");
				System.out.println("else statement");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression){");
				System.out.println("case constant:");
				System.out.println("statement seqeunce");
				System.out.println("break;");
				System.out.println(" //...");
				System.out.println("}");
				break;
			default:
				System.out.println("Selection not found");
				
		}
	}
}

