package assignments1;

public class PrimeNumbers {

	public static void main(String[] args) {

		for (int i = 3; i <= 21; i++) {
			int flag = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					flag = 1;
					System.out.println("not a prime number "+i);
					break;
				}
			}
			if (flag == 0)
				System.out.println("Prime number is " + i);
		}

	}

}
