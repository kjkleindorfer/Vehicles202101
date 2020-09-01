package model;

//added by Bob

public class Jet {
	private String name;
	private int seatingCapacity;
	private int topSpeed;

	public Jet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jet(String name, int seatCap, int tSpeed) {
		super();
		this.name = name;
		this.seatingCapacity = seatCap;
		this.topSpeed = tSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatCap) {
		this.seatingCapacity = seatCap;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int tSpeed) {
		this.topSpeed = tSpeed;
	}

	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Swooosh!";
	}
}