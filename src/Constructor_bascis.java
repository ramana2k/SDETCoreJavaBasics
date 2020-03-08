

// Define a class and create its objects, define its attributes, constructors and member functions.

public class Constructor_bascis {
	
	
	public Constructor_bascis()
	{
		int a=15;
		int b=20;
		System.out.println("I am calling the constructor first");
		System.out.println("I am calling the constructor first and A value is "+a);
		System.out.println("I am calling the constructor first and B value is "+b);
	}
	
	public void local_method()
	{
		System.out.println("I am in local method");
	}
	public static void main(String[] args) {
		
		Constructor_bascis localMethod= new Constructor_bascis();
		localMethod.local_method();
		
	}
}
