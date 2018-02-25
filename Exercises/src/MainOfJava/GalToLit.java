package MainOfJava;

/* Пример для опробования 1.1 Эта программа преобразует галлоны в литры.
Присвоить ее исходному файлу имя GalToLit.java. */

public class GalToLit {
	
public static void main(String argh[]) {
	
	double gallons; // в этой переменной хранится объем жисдкости в галлонах
	double liters; // в этой перемнной хранится объем жисдкости в литрах
	
	gallons = 10; // идходное значение равно 10 галлонам
	liters = gallons * 3.7854; //преобразовать в литры
	
			System.out.println(gallons + " gallons is " + liters + " liters");
		}
}