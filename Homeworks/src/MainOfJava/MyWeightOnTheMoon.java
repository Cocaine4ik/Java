package MainOfJava;

/*Сила тяжести на Луне составляет около 17% земной.
 *  Напишите программу, которая вычисляла бы ваш вес на Луне.*/

public class MyWeightOnTheMoon {
	
	public static void main(String argh[]){
		
		double earth, moon, weight;
		
		earth = 9.80665;
		System.out.println("Сила притяжения на Земле " + earth + "м/с в квадрате");
		
		weight = 52.0;
		System.out.println("Мой вес на Земле " + weight + "кг");
		System.out.println();
		
		moon = earth * 0.17;
		System.out.println("Сила притяжения на Луне " + moon + "м/с в квадрате");
		
		weight = weight * moon;
		System.out.println("Мой вес на Луне " + weight + "кг");
	}
}

