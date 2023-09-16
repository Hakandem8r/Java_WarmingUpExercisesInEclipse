package exceptionHandling;

public class _3_ThrowsException {

	public static void divide() throws ArithmeticException, NumberFormatException {
		int a = Integer.parseInt("8b"); // => 8b => first exception. 8 second exception
		int b = Integer.parseInt("0");
		int c = a / b;
		System.out.println("Result : " + c);
	}

	public static void main(String[] args) {

		try {
			divide();

		} catch (NumberFormatException e) {
				System.out.println("Invalid number format!");
		}
		catch (ArithmeticException e) {
			System.out.println("You cannot divide number by zero!");
		}
	}

}
