package assignments1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Please enter the year to check leap year or not");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		boolean flag =((number % 4 == 0) &&  (number % 100)!=0 || (number % 400 == 0));
		if (flag) {
			System.out.println(" the year" + number + " " + "is a leap year");
		} else
			System.out.println(" the year" + number + " " + "is not a leap year");

	}

}
