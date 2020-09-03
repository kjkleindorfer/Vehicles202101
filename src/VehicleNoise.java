import model.*;

public class VehicleNoise {
	//add your new vehicle class to the model package
	//only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		
		Motorcycle harley = new Motorcycle();
		System.out.println(harley.makeNoise());
		
		Motorcycle bmw = new Motorcycle("BMW", "Blue", 2003);
		System.out.println(bmw.getColor());
		
		Motorcycle ducati = new Motorcycle("Ducati", "Black", 2015);
		System.out.println(ducati.getName());
				
	}

}
