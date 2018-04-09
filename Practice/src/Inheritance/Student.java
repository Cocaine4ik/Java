package Inheritance;

public class Student extends Man {

	private int yearofsrudy;
	
	Student(String n, int a, String g, int w, int y) {
		super(n, a, g, w);
		yearofsrudy = y;		
	}
	
	int getYearofsrudy() { return yearofsrudy; }
	void setYearofsrudy(int y) { yearofsrudy = y; }
	
	void increaseYearofsrudy() { yearofsrudy = yearofsrudy + 1; }
}
