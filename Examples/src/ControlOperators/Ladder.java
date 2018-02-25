package ControlOperators;

//Демонстрация многоступенчатой конструкции if-else-if
public class Ladder {
	public static void main(String argh[]) {
		
		int x;
		
		for(x = 0; x < 6; x++) {
			
			if(x==1) System.out.println("x is one");
			
			else if(x==2) System.out.println("x is two");
			
			else if(x==3) System.out.println("x is three");
			
			else if(x==4) System.out.println("x is four");
			
			else // условие выполняемое по умолчанию
				System.out.println("x is not beteen 1 and 4");
		}  
	}
}
