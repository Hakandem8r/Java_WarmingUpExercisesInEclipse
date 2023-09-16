package z_13_superThis;

public class superThisTest {

	public static void main(String[] args) {
		
		//Creating Car object
		
		Car car = new Car("Car", "Ferrari", 320, true);
		System.out.println("Type: " + car.getType());
		System.out.println("Model: " + car.getModel());
		System.out.println("MaxSpeed: "+ car.getMaxSpeed());
		System.out.println("Is car automatic? "+ car.isAutomatic());
	}

}
