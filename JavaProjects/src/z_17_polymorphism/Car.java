package z_17_polymorphism;

public class Car extends Vehicle {
	
	@Override //=> Override is not mandatory here
	public void accelerate() {
		System.out.println("Car is accelerating.");
	}

}
