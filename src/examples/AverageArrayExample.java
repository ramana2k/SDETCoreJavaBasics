package examples;

import java.util.Scanner;

public class AverageArrayExample {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < 5; i++) {
			arr[i] = reader.nextInt();
		}
		reader.close();
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("Sum is " + sum);
		int average= sum/arr.length;
		System.out.println("average is " + average);
	}
}
