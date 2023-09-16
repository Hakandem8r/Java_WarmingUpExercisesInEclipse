package exceptionHandling;

public class _4_ThrowableMethods {
	
	public static double divide (double x, double y) {
		
		if (y == 0) {
			throw new ArithmeticException ("ArithmeticException ocurred.");
		}
		return x / y;
	}

	public static void main(String[] args) {
		
		double d;
		try {
		d = divide (5.6, 0);
		}
		catch (ArithmeticException e) {
			System.out.println("Divider cannot be equal to zero.");
			// useful Throwable methods
		//1.	System.out.println(e.getMessage());
		//2.	System.out.println(e.toString());
		/* 3 */	e.printStackTrace();  
		}
	}

}
