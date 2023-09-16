package _1_project;

import java.util.Scanner;

public class z_12_IfElseStatement {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = inputNumber.nextInt();
		
		if (number%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		inputNumber.close(); 
	}

}
