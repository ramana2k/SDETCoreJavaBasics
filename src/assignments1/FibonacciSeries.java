package assignments1;

import java.util.ArrayList;

/* Write a program to sort the elements of an array in ascending order.
4. Write a program to check current year is leap year or not. User will enter year value.
5. Write a program to print first 10 prime numbers.
*/
//0,1,1,2,3,5,8,11....
public class FibonacciSeries {

	public static void main(String[] args) {

        int i = 1, n = 5, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        while (i <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }

}
