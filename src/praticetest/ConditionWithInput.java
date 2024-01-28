package praticetest;

import java.util.Scanner;

public class ConditionWithInput {
	
	public static void main(String[] args) {
	//Input the value through scanner class
		System.out.println("Enter your Age :");
		try (Scanner input = new Scanner(System.in)) 
		{
			//Declare variable to get input through the command line
			int age = input.nextInt();
			//Add If else If condition
			if(age < 18) {
				System.out.println("You are not allowed.");
			}else if (age >= 18) 
			{
				System.out.println("You are fully eligible.");
			}else 
			{
				System.out.println("You are not allowed.");
			}
		}
					
	}

}
