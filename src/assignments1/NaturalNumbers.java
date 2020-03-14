package assignments1;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		System.out.println("Please enter the natural number to do sum");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		int sum=0;
        scanner.close();
		for (int i=1;i<=value;i++)
		{
			sum= sum+i;
		}
		System.out.println("Sum of natural numbers for first numbers are "+ sum);
	}

}
