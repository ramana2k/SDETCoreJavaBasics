package Lab1;

import java.util.Scanner;

public class ComputeModulus {
	
	

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first =scan.nextInt();
		System.out.println("Enter the second number: ");
		int second =scan.nextInt();	
		scan.close();
		System.out.println("The modulus value is :"+first%second);

	}

}
