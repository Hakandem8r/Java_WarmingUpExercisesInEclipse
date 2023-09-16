package z_18_encapsulation;

public class Vehicle {
	
	private String model;
	private int maxSpeed;
	
	public Vehicle (String model, int maxSpeed) {  //public Constructor named Vehicle
		this.model = model;
		this.maxSpeed = maxSpeed;
		
		
	}
	//--------------maxSpeed => getter-setter----------------
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	//--------------Model => getter-setter----------------
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
