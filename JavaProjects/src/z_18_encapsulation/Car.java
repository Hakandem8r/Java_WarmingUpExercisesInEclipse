package z_18_encapsulation;

public class Car extends Vehicle{

	public boolean isAutomatic = false;
	
	public Car(String model, int maxSpeed, boolean isAutomatic) {
		super(model, maxSpeed);
		this.isAutomatic = isAutomatic;
		
	}

	//--------------isAutomatic => getter-setter----------------
	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	
	

}
