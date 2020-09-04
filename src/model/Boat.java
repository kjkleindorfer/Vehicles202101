package model;

// added by Robby

public class Boat {

	private String name;
	private double beam;
	private double displacment;
	
	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boat(String name, double beam, double displacment) {
		super();
		this.name = name;
		this.beam = beam;
		this.displacment = displacment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBeam() {
		return beam;
	}

	public void setBeam(double beam) {
		this.beam = beam;
	}

	public double getDisplacment() {
		return displacment;
	}

	public void setDisplacment(double displacment) {
		this.displacment = displacment;
	}
	
	public String makeNoise() {
		return "Awooga!";
	}
	
	
}
