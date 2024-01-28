package praticetest;

public class FunctionExamples {
	/*Functions : Set of code that used to perform certain actions
	*Three types of Access Modifiers:Public(Use within the project), Private (User within the class), 
	 * Protected (Use when inheritable the class. Consider limited access )
	 *Function Syntax : Public data type funtion_name(){add required code}
	 *Call function syntax: class_name f1 = new class_name();
	f1.function_name();*/
	public static void main(String[] args) {
		System.out.println("Hello World");
		FunctionExamples f1 = new FunctionExamples();
		f1.getAge();
		f1.getStatus();
		f1.getprivateclass();
		f1.getstaticclass();
	}
	//Function call With return value.
	public int getAge() 
	{
		System.out.println("Validate age function.");
		return 18;
	}
	//Function call Without return value.
	public void getStatus() 
	{
		System.out.println("Validate status function.");
	}
	//Use Function Within class only. By default convert in private class
	void getprivateclass() 
	{
			System.out.println("Validate private Class function.");
	}
	//call Function Within class only. By default convert in static class
	static void getstaticclass() 
	{
			System.out.println("Validate static Class function.");
	}
}
