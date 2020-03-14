package assignments1;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		System.out.println("Please enter the number to print even numbers ");
		Scanner scanner = new Scanner(System.in);
		int range = scanner.nextInt();
		scanner.close();
		for (int i = 0; i <= range; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i + " ");

			}
		}
	}

}
