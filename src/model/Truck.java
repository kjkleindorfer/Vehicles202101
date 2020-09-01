package model;

public class Truck {
	
	//added by Md Ahmed
	
	private String name;
	private String color;
	private int year;
	
	public Truck() {
		super();
	}

	public Truck(String name, String color, int year) {
		super();
		this.name = name;
		this.color = color;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String makeNoise() {
		return "Troook Troook";
	}
}

