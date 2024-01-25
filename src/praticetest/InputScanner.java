package praticetest;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		// Scanner class use to get input from the end user through system
		
		System.out.println("Please enter you name, Age and salary : ");
		try (Scanner scan = new Scanner(System.in)) 
		{
			String name = scan.nextLine();
			int age = scan.nextInt();
			float salary = scan.nextFloat();
			System.out.println("Your name is :"+name);
			System.out.println("Your Age is :"+age);
			System.out.println("Your Salary is :"+salary);
		}
	}

}
