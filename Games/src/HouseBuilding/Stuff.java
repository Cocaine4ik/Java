package HouseBuilding;

public class Stuff implements Building {

	private char type;
	
	Stuff(char t) {
		type = t;
	}

	public void build(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print(type);
		}
		System.out.println();
	}
		
	public void build() {
		System.out.print(type);
	}

	public char getType() { return type; }
	public void setType(char t) { type = t; }

}
