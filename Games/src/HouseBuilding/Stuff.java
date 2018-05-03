package HouseBuilding;

public class Stuff implements Building {

	private char type;
	private int num;
	
	Stuff(char t, int n) {
		type = t;
		num = n;
	}

	public void print(char type, int num) {
		for(int i = 0; i < num; i++) {
			System.out.print(type);
		}
		System.out.println();
	}
	
	public void print(Stuff ob) {
		for(int i = 0; i < ob.num; i++) {
			System.out.print(ob.type);
		}
		System.out.println();
	}
	
	public void print() {
		System.out.print(type);
	}

	public char getType() { return type; }
	public void setType(char t) { type = t; }
	
	public int getNum() { return num; }
	public void setNum(int n) { num = n; }

}
