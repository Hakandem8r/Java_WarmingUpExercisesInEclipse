package _1_project;

import java.util.Scanner;

public class _2_Input_Scanner {

	public static void main(String[] args) {

		Scanner inputNumber=new Scanner(System.in);
		
		System.out.print("Input a number= ");
		
		//int number = inputNumber.nextInt();
		
		//System.out.println("You entered = " + number);
		
		System.out.println("You entered = "+ inputNumber.nextInt());
		
		inputNumber.close();
	}

}
