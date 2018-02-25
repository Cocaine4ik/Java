package ControlOperators;

/*В этом проекте предстоит завершить построение справочной системы Java, начатое в предыдущих проектах.
 *  Данная версия будет дополнена сведениями о синтаксисе операторов break и continue,
 *  а также даст пользователю возможность запрашивать сведения о синтаксисе нескольких операторов.
 *  Эта цель достигается путем добавления внешнего цикла, который выполняется до тех пор, пока пользователь
 *  не введет с клавиатуры букву q вместо номера пункта меню. */

public class Help3 {
	public static void main(String argh[]) throws java.io.IOException {
		char choice, ignore;
		do {
			System.out.println("Help on.");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. for");
			System.out.println("4. while");
			System.out.println("5. do-while"); 	
			System.out.println("6. break");
			System.out.println("7. continue \n");
			System.out.println("Choose one(q to quit): ");
			choice=(char) System.in.read();
				do {
					ignore=(char) System.in.read();
				}
				while(ignore != '\n');
		}
		while(choice <'1' | choice > '7' & choice != 'q');
		
		switch(choice) {
		case '1':
			System.out.println("The if: \n");
			System.out.println("if(condition)statement");
			System.out.println("else statement");
		break;
		case '2':
			System.out.println("The switch: \n");
			System.out.println("switch(expression) { ");
			System.out.println("case constant: ");
			System.out.println("statement sequence");
			System.out.println("break; ");
			System.out.println("// ... ");
			System.out.println(" } ");
		break;
		case '3':
			System.out.println("The for: \n");
			System.out.println("for(init; conditon; iterration)");
			System.out.println("statement");
		break;
		case '4':
			System.out.println("The while: \n");
			System.out.println("while(condition) statement:");
		break;
		case '5':
			System.out.println("The do-while: \n");
			System.out.println("do { ");
			System.out.println("statement");
			System.out.println(" } ");
			System.out.println("while(condition)");
		break;
		case '6':
			System.out.println("The break: \n");
			System.out.println("break; or break label;");
		break;
		case '7':
			System.out.println("The continue: \n");
			System.out.println("The continue; or continue label;");
		break;
		}
	}
}

