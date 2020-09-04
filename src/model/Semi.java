package model;

//Nikki McCloud
public class Semi {

	private String name;
	private String color;
	private int age;

	public Semi() {
		super();
	}

	public Semi(String name, String color, int age) {
		super();
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
		return "Honk!";
	}
}