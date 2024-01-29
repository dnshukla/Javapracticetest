package praticetest;

import java.util.Scanner;

public class SwitchExamples {
	public static void main(String[]args) {
		System.out.println("Please enter your age:-");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		//User Switch statement with user inputs to check the condition 
		switch(age) {
		case 17 : 
			System.out.println("You are consider under Minor Voter.");
			break;
		case 18 : 
			System.out.println("You are consider under Adult Voter.");
			break;
		default : 
			System.out.println("You are not egligible for this categroy.");	
		}
	}

}
