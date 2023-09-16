package z_11_ObjectOrientedProgramming._1_inheritance;

public class _4_InheritanceTest {

	public static void main(String[] args) {
		//Lets create a new car object
		_2_Car car = new _2_Car();
		car.type = "Car";
		car.model = "Ferrari";
		car.maxSpeed = 320;
		car.print();
		
	System.out.println("...............................");
	
		//Lets create a motorcycle object.
		_3_Motorcycle motor = new _3_Motorcycle();
		motor.type = "Motorcycle";
		motor.model = "Kwasaki";
		motor.maxSpeed = 180;
		motor.print();
	}

}
