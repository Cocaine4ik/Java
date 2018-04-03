package Inheritance;

public class Student extends Man {

	private int yearofsrudy;
	
	
	Student(String n, int a, String g, int w, int y) {
		super(n, a, g, w);
		yearofsrudy = y;		
	}
	
	int getYearofsrudy() { return yearofsrudy; }
	void setYearofsrudy(int y) { yearofsrudy = y; }
	
	int increaseYearofsrudy() { return yearofsrudy + 1; }
}
