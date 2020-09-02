import model.*;

public class VehicleNoise {
	//add your new vehicle class to the model package
	//only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
    
    Jet gulfStream = new Jet("Gulf Stream V", 14, 530);
		System.out.println(gulfStream.makeNoise());

		Semi peterBuilt = new Semi();//Nikki McCloud
		System.out.println(peterBuilt.makeNoise());

    Truck ford = new Truck();
    System.out.println(ford.makeNoise());

    RaceCar racer = new RaceCar();
    System.out.println(racer.makeNoise());
    
    AudiS7 s7 = new AudiS7();
    System.out.println(s7.makeNoise());
	}

}


