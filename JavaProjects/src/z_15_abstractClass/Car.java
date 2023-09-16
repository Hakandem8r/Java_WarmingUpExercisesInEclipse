package z_15_abstractClass;

public class Car extends Vehicle{

	public Car(String type, String mode) {
		super(type, mode);
		
	}

	@Override
	public int getMaxSpeed() {
		final int MAX_CAR_SPEED = 320;
		System.out.println("Max speed of car is : " + MAX_CAR_SPEED);
		return MAX_CAR_SPEED;
	}
	
	//coppied and pasted two non-abstract method from the Vehicle class
		@Override
		public void start () {
			System.out.println("Car has started.");
		}
		
		@Override
		public void stop () {
			System.out.println("Car has stopped.");
		}

}
