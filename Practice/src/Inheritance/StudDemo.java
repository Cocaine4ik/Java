package Inheritance;

public class StudDemo {
	public static void main(String args[]) {
		
		Student student1 = new Student("Jack", 21, "male", 81, 2017);
		Student student2 = new Student ("Amanda", 19, "female", 52, 2015);
		
		System.out.println("The first student: ");
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Gender: " + student1.getGender());
		System.out.println("Weight: " + student1.getWeight());
		System.out.println("Year of study: " + student1.getYearofsrudy());
		
		System.out.println();
		
		System.out.println("The first student: ");
		System.out.println("Name: " + student2.getName());
		System.out.println("Age: " + student2.getAge());
		System.out.println("Gender: " + student2.getGender());
		System.out.println("Weight: " + student2.getWeight());
		System.out.println("Year of study: " + student2.getYearofsrudy());
		
		System.out.println();
		
		student1.increaseYearofsrudy();
		student2.increaseYearofsrudy();
		
		System.out.println();
		
		System.out.println("The first student: ");
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Gender: " + student1.getGender());
		System.out.println("Weight: " + student1.getWeight());
		System.out.println("Year of study: " + student1.getYearofsrudy());
		
		System.out.println();
		
		System.out.println("The first student: ");
		System.out.println("Name: " + student2.getName());
		System.out.println("Age: " + student2.getAge());
		System.out.println("Gender: " + student2.getGender());
		System.out.println("Weight: " + student2.getWeight());
		System.out.println("Year of study: " + student2.getYearofsrudy());
		
	}
}
