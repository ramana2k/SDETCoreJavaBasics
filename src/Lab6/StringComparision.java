package Lab6;

import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {
		System.out.println("Please enter the first string ");
		Scanner scanner = new Scanner(System.in);
		String firstString = scanner.next();
		System.out.println("Please enter the second string");
		String secondString = scanner.next();
		scanner.close();
	
	if(firstString.equals(secondString))
		System.out.println("equal");
	else
		System.out.println("not equal");
	}
}
