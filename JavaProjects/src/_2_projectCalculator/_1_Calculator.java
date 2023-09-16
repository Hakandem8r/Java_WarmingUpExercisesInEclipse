package _2_projectCalculator;

import java.util.Scanner;

public class _1_Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("--------------CALCULATOR--------------");
		System.out.print("Please enter 2 int number: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		System.out.print("Choose an operation (+, -, *, /, %) : ");
		char operator = input.next().charAt(0);
		double result = 0.0;
		
		switch(operator) {
			case '+': 
				result = number1 + number2; 
				break;
			case '-': 
				result = number1 - number2; 
				break;
			case '*': 
				result = number1 * number2; 
				break;
			case '/': 
				result = number1 / number2; 
				break;
			case '%': 
				result = number1 % number2; 
				break; //exit from switch statement
			default: 
				System.out.println("Invalid operator choice!!!"); 
				return; // exit from the current method
		}
		//display the result
		System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
		input.close();
	}

}
