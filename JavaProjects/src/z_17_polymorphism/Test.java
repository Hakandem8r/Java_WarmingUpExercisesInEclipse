package z_17_polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();
		//This code works because Car is a subclass of vehicle.
		vehicle.accelerate();  
		//In this definition, the reference variable VEHICLE is pointing to the 
		//object in Car class.
		
		Vehicle vehicle1 = new Motorcycle();
		//This code works because Motorcycle is a subclass of vehicle.
		vehicle1.accelerate();
		//In this definition, the reference variable VEHICLE is pointing to the 
		//object in Motorcycle class.

	}

}
