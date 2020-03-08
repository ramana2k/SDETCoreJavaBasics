
public class VariableExercises {

	static int global_variable=100;

	//Write a program where you declare all 3 different types of variables, a member function and print the value of each variable.
	public static void main(String[] args) {
		
		int instance_variable=10;

		System.out.println("Instance Varable value in instance_variable  in main method"+instance_variable);
		System.out.println("Instance Varable value in global_variable  in main method"+global_variable);

		VariableExercises VE= new VariableExercises();
		VE.localVariables();
		
	}
	
	public  void localVariables()
	{
		int local_variable=50;
		System.out.println("Local Varable value in localVariables  method"+local_variable);
		System.out.println("Instance Varable value in localVariables  method"+global_variable);

		
	}

}
