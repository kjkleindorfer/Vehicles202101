package model;
 // added by Paul

public class Motorcycle2 {
	private String name;
	private String color;
	private int age;

	public Motorcycle2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorcycle2(String name, String color, int year) {
		super();
		this.name = name;
		this.color = color;
		this.age = year;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Vroom! Vroom!";
	}
}
