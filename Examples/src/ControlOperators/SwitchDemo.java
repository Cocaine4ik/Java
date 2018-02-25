package ControlOperators;

//Демонстрация оператора Switch

public class SwitchDemo {
	
public static void main(String argh[]) {
	
	 int i;
	 
	 for(i = 0; i < 10; i++)
		 
		 switch(i) {
		 
		 case 0: System.out.println("i is zero"); break;
		 
		 case 1: System.out.println("is is one"); break;
		 
		 case 2: System.out.println("i si two"); break;
		 
		 case 3: System.out.println("i is three"); break;
		 
		 case 4: System.out.println("i is four"); break;
		 
		 default: System.out.println("i is five or more"); break;
		 }
}
}
