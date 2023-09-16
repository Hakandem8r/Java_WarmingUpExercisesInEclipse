package z_16_interface;

public class Motorcycle implements Drivable {

	@Override
	public void turnLeft() {
		System.out.println("Motorcycle can turn left");
	}

	@Override
	public void turnRight() {
		System.out.println("Motorcycle can turn right");
	}

}
