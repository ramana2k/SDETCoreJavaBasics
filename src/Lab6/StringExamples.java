package Lab6;

import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		System.out.println("Please enter the first string to append to string buffer");
		Scanner scanner = new Scanner(System.in);
		String firstString = scanner.next();
		System.out.println("Please enter the second string to append to string builder");
		String secondString = scanner.next();
		scanner.close();
	}

}
