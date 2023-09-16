package _1_project;

import java.util.Scanner;

public class _3_Inpu_Scanner {

	public static void main(String[] args) {
		
		Scanner inputText=new Scanner(System.in);
		
		System.out.print("Enter a text = ");
		
		System.out.println("You entered = " + inputText.next());
		
		inputText.close();
		
		

	}

}
