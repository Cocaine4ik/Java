package ControlOperators;

public class NoBreak {
	public static void main(String argh[]) {
		int i;
		for(i = 0; i <= 5; i++) {
			switch(i) {
			case 0: System.out.println("i is less then one");
			
			// далее следует провал в ветвях case оператора switch
			
			case 1: System.out.println("i is less then two");
			case 2: System.out.println("i is less then three");
			case 3: System.out.println("i is less then four");
			case 4: System.out.println("i is less then five");			
			}
			System.out.println();
		}
	}
}

