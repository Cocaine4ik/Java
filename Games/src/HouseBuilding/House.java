package HouseBuilding;

public class House implements Building{
	
	int floor; // floor number
	int flat; // flat number
	
	char roof; // roof style
	char wall; // wall style
	char lw; // left part of the window style
	char rw; // right part of the window style
	char f; // foundation style
	char ld; // left door part style
	char rd; // right door part style
	char md; // middle door style
	

	House(int floor, int flat, char roof, char wall, char lw, char rw, char f, char ld,
			char rd, char md) {
		
		this.floor = floor;
		this.flat = flat;
		
		this.roof = roof;
		this.wall = wall;
		this.lw = lw;
		this.rw = rw;
		this.f = f;
		this.ld = ld;
		this.rd = rd;
		this.md = md;

	}
	
	House() {}

	public void build(char style) {
		System.out.print(style);
	}	
		
	public void build(char style, int num) {
		for(int i = 0; i < num; i++) {
			System.out.print(style);
		}
	}
		
	int getFloor() { return floor; }
	void setFloor(int floor) { this.floor = floor; }
	
	int getFlat() { return flat; }
	void setFlat(int flat) { this.flat = flat; }
	
	char getRoof() { return roof; }
	void setRoof(char roof) { this.roof = roof; }
	
	char getWall() { return wall; }
	void setWall(char wall) { this.wall = wall; }
	
	char getLw() { return lw; }
	void setLv(char lw) { this.lw = lw; }
	
	char getRw() { return rw; }
	void setRw(char rw) { this.rw = rw; }
	
	char getF() { return f; }
	void setF(char f) { this.f = f; }
	
	char getLd() { return ld; }
	void setLd(char ld) { this.ld = ld; }
	
	char getRd() { return rd; }
	void setRd(char rd) { this.rd = rd; }
	
	char getMd() { return md; }
	void setMd(char md) { this.md = md; }
	
}