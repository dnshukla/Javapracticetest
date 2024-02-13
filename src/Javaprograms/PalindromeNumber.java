package Javaprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		/* After reverse the entered number we can compare with result number with entered number.
		And If both are the same than we can call it as 'palindrome Number'*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = scan.nextInt();
		int org_num=num;
		
		int rev = 0;
		while(num!=0) {
			rev= rev*10 + num%10;
			num = num/10;
			}
		
		if (org_num==rev) {
			System.out.println(org_num+" is palindrome Number");
		}
		else {
			System.out.println(org_num+" is not palindrome Number");
		}
	}

}
