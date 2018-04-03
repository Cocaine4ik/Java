package Inheritance;

public class Man {

	private String name;
	private int age;
	private String gender;
	private int weight;
	
	
	Man(String n, int a, String g, int w) {
		name = n;
		age = a;
		gender = g;
		weight = w;
		
	}
	
	String getName() { return name; }
	void setName(String n) { name = n; }
	
	int getAge() { return age; }
	void setAge(int a) { age = a; }
	
	String getGender() { return gender; }
	void setGender(String g) { gender = g; }
	
	int getWeight() { return weight; }
	void setWeight(int w) { weight = w; }
}
