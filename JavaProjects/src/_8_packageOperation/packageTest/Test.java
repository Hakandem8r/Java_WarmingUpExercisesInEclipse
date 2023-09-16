package _8_packageOperation.packageTest;

//Built-in package java.util
import java.util.Scanner;

import _8_packageOperation.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 2 integer numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		Multiply obj = new Multiply();
		System.out.println("Result: " + obj.multiply(number1, number2));
		
		Add obj1 = new Add(); //no need to import because of added * at the top
		System.out.println("Result: "+ obj1.add(number1, number2));
		
				
				
	}

}
