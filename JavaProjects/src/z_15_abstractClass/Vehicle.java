package z_15_abstractClass;

public abstract class Vehicle {
	
	String type, model;
	
	//Constructor
	public Vehicle (String type, String mode) {
		this.type = type;
		this.model = model;
		
	}
	
	//Let's declare two non-abstract method in the Vehicle class
	public void start () {
		System.out.println("Vehicle has started.");
	}
	
	public void stop () {
		System.out.println("Vehicle has stopped.");
	}
	
	//Lets declare an abstarct int method which named getMaxSpeed
	public abstract int getMaxSpeed ();
}
