package z_13_superThis;

public class Car extends Vehicle{

	boolean isAutomatic = true;
	
	public Car(String type, String model, int maxSpeed, boolean isAutomatic) {
		super(type, model, maxSpeed);  //superclass constructor calling
	}

	//getter method
	public boolean isAutomatic() {
		return isAutomatic;
	}
	
	

}
