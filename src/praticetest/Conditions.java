package praticetest;

public class Conditions {

	public static void main(String[] args) {
		//If statement : Use for single condition
		int A = 10;
		if (A==10) 
		{
			System.out.println("Your first condition is right.");
		}
		
		//If Else statement : Use for Two conditions
		String name = "Dhairy";
		if (name == "Dhairya") 
		{
			System.out.println("Your name is correct.");
		}else
		{
			System.out.println("Try again.");
		}
		
	    //If else if statement : Use for Multiple conditions
		String techername = "Dhairya";
		float salary = 24500;
		if (techername == "abc" && salary == 25000) 
		{
			System.out.println("Fulfil is first condition.");
		}
		else if (techername == "abc" || salary == 25000) 
		{
			System.out.println("Fulfil is second condition.");
		}
		else if (techername != "abc" || salary > 25000) 
		{
			System.out.println("Fulfil is third condition.");
		}else
		{
			System.out.println("Try again.");
		}
	}

}
