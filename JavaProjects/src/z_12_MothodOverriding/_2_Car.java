package z_12_MothodOverriding;

public class _2_Car extends _1_Vehicle{	
//This means: Sub-Class Car, inherit all the methods from the super class Vehicle

	//If we do not past those below, it will give the result of Vehicle, not the car...
	public void start () {
		System.out.println("Car has started");
	}
	
	public void accelerate (int speed) {
		System.out.println("Car accelerates at "+ speed);
	}
	
	public void stop () {
		System.out.println("Car has stopped");
	}
}
