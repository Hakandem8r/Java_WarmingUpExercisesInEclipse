package _1_project;

import java.util.Scanner;

public class z_14_SwitchCaseStatement {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Please enter a day number of week: ");
		int dayNumber = number.nextInt();
		String day;
		switch(dayNumber) {
		case 1: day = "Monday"; break;
		case 2: day = "Tuesday"; break;
		case 3: day = "Wednesday"; break;
		case 4: day = "Thursday"; break;
		case 5: day = "Friday"; break;
		case 6: day = "Saturday"; break;
		case 7: day = "Sunday"; break;
		default: day = "Invalid day"; break;
		}
		System.out.println("Day: " + day);
		number.close();
	}

}
