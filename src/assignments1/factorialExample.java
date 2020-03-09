package assignments1;

import java.util.Scanner;

public class factorialExample {

	public static void main(String[] args) {

		System.out.println("Please enter the number to calculate the factorial");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		int fact = 1, localvalue = 1;
		while (localvalue <= number) {
			fact = fact * localvalue;
			System.out.println("fact value now "+fact);
			localvalue++;
		}
		System.out.println("Factorial of " + number + " is:    " + fact);

	}

}
