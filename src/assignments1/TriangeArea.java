package assignments1;

import java.util.Scanner;

public class TriangeArea {

	public static void main(String[] args) {
		System.out.println("Please enter the base of the triangle");
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		System.out.println("Please enter the heigth of the triangle");
		int heigth = scanner.nextInt();
		scanner.close();
		
		double area = base*heigth/2;
		System.out.println("Area of the triangle is "+area);
	}

}
