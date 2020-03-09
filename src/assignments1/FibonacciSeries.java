package assignments1;

import java.util.ArrayList;

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
