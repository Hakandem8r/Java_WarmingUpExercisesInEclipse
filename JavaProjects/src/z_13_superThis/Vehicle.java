package z_13_superThis;

public class Vehicle {
	String type, model;
	int maxSpeed;
	
	//Constructor
	public Vehicle (String type, String model, int maxSpeed) {
		this.type = type;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	//getter methods => right click => source => [just] getter
	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	
	

}
