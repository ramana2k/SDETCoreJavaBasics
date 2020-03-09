package Lab1;

public class UnaryOpDemo {
	
	
	public static void main(String[] args)
	{
		int a=5, b=6;
		int m=9, n=3;
	    int c = a++ + ++b;
	    System.out.println("The value of b is: " + b);
	    System.out.println("The value of c is: " + c);
	    System.out.println("The value of a is: " + a);

	    int d = (++a + b++) + a;
		System.out.println("The value of b is: " + b);
		System.out.println("The value of a after increment is: " + a);
		System.out.println("The value of c is: " + c);
		System.out.println("The value of d is: " + d);
		
		int o = m-- + --n;
		System.out.println("The value of o is: " + o);
		System.out.println("The value of n is: " + n);
		System.out.println("The value of m is: " + m);
	}
}