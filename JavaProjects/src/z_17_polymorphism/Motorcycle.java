package z_17_polymorphism;

public class Motorcycle extends Vehicle {

	@Override //not mandatory
	public void accelerate () {
		System.out.println("Motorcycle is accelerating.");
	}
}
