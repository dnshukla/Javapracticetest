package Javaprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		/* After reverse the entered string we can compare with result string  with entered string.
		And If both are the same than we can call it as 'palindrome string'*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String value:");
		String str = scan.nextLine();
	    String Org_str=str;
		String rev = "";
		int len=str.length();
		for (int i=len-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		//System.out.println("Reverse the String value:"+rev);
		
		if (Org_str.equals(rev)) 
		{
			System.out.println(Org_str+" is palindrome string value");
		}
		else 
		{
			System.out.println(Org_str+" is not palindrome string value");
		}

	}

}
