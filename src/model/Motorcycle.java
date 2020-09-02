package model;

	// Added by Brogan Avery

public class Motorcycle {
	private String make;
	private String color;
	private String year;

	public Motorcycle() {
		super();
		
	}

	public Motorcycle(String make, String color, String year) {
		super();
		this.make = make;
		this.color = color;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String makeNoise() {
		
		return "BRRAAAP";
	}
}
