package Inheritance;
// circle demo
public class CircleDemo {
	public static void main(String args[]) {
		
		Circle ob = new Circle(8, "circle");
		
		System.out.println("Diameter is " + ob.dia());
		System.out.println("Radius is " + ob.radius());
		System.out.println("Area is " + ob.area());
	}
}
