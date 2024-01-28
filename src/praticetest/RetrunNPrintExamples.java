package praticetest;

public class RetrunNPrintExamples {
	public static void main(String []args) {
		// PrintIn : Use to display the data as response and display the function return value as well
		// Return : Mandatory use for return value where pass the data type in function
		
		//Println : Display the data or value
		System.out.println("Hello dhairya");
		
		//Println & return : Display the return value of the function
		System.out.println("Function return value is : "+(getdata()));
		
		//Println & return: Display the return value of the function through store in variable
		String name = getname();
		System.out.println(name);
		
	}
	//Create static function with return value
	public static int getdata() {
		return 345; // Use to return the function value
	}
	public static String getname() {
		return "Dhairya Shukla"; // Use to return the function value
	}
}
