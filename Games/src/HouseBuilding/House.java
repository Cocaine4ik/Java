package HouseBuilding;

public class House{
	
	int floor;
	int flat;

	House(int floor, int flat) {
		this.floor = floor;
		this.flat = flat;
	}
	
	public int getFloor() { return floor; }
	public void setFloor(int floor) { this.floor = floor; }
	
	public int getFlat() { return flat; }
	public void setFlat(int flat) { this.flat = flat; } 
	
	public void plan(int roof, int windows) {
		roof = floor;
		windows = floor/2-2;
	}

}