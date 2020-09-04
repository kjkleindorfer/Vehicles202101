package model;

public class RaceCar {
	//chase van blair
	private String name;
	private String color;
	private int age;

	public RaceCar() {
		super();
	}

	public RaceCar(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
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
		return "zzzzoooooooooooooom";
	}
}