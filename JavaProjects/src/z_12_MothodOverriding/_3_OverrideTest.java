package z_12_MothodOverriding;

public class _3_OverrideTest {

	public static void main(String[] args) {

		//Create a Vehicle object.
		_1_Vehicle vehicle = new _1_Vehicle();
		vehicle.start();
		vehicle.accelerate(80);
		vehicle.stop();
		
		//Creating a car object.
		_2_Car car = new _2_Car();
		car.start();
		car.accelerate(100);
		car.stop();
		
	}

}
