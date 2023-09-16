package _5_project_FibonacciSeries;

import java.util.Scanner;

public class _1_Fibonacci {

	public static void main(String[] args) {
		//Fibanocci series: 0,1,1,2,3,5,8,13,21,34,55...
		Scanner input = new Scanner(System.in);
		System.out.print("Input max sequence number: ");
		int number = input.nextInt();
		
		int fibPrevious = 0, fibonacci = 1, sum = 0;
		
		for (int i = 0; i <= number; i++) {
			System.out.print(fibPrevious + " ");
			sum = fibPrevious + fibonacci;
			fibPrevious = fibonacci;
			fibonacci = sum;
			
		}

	}

}
