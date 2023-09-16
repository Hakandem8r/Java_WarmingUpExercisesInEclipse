package _1_project;

public class z_11_OperatorPresedence {

	public static void main(String[] args) {
		
		int result = 5 + 2 * 4;
		System.out.println("Result: " + result );
		
		result = (5+2) * 4;
		System.out.println("Result: "+ result);
		
		int x = 8, y = 4, z = 2, sum = 0;
		sum = x + --y + --z;
		System.out.println("Sum: " + sum);
		
		System.out.println("---------------------------------");
		
		int a = 2+5/2%7*4-2;  // (2+(5/2)%(7*4)-2)
		System.out.println("a: "+ a);
	}

}
