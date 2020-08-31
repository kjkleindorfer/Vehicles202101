import model.*;

public class VehicleNoise {
	//add your new vehicle class to the model package
	//only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		Truck ford = new Truck("ford", "black", 3);
		RaceCar racer = new RaceCar();
		
		System.out.println(honda.makeNoise());
		System.out.println(ford.makeNoise());
		System.out.println(racer.makeNoise());
		
	}

}
