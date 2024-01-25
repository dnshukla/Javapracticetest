package praticetest;

public class NestedIfelse {

	public static void main(String[] args) {
		// Nested If else : Add If condition with in the condition, There is no limit to add nested If condition
		int age = 18;
		String gender = "Male";
		boolean isRegister = false;
		if (age >=18) 
		{
			System.out.println("You are eligible.");
		    if (gender == "Male") 
		    {
		    	System.out.println("You are invited.");
		    	    if (isRegister == true) 
		    	    {
		        	System.out.println("Welcome to the team.");
		            } 
		    	    else {
		        	System.out.println("You need to register it.");
		             } 	
		    }else{
		    	System.out.println("You are not invited.");
		    	}
		}else{
			System.out.println("You are not eligible.");
		}
	}

}