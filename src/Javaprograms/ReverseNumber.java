package Javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = scan.nextInt();
		
		/*Logic 1 : Using StringBuffer Class
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse the Number:"+rev);
		*/
		
		//Logic 2 : Using StringBuilde Class
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		sb1.reverse();
		System.out.println("Reverse the Number:"+sb1);
		
		/*Logic 3 : Using algorithm
		int rev = 0;
		while(num!=0) {
			rev= rev*10 + num%10;
			num = num/10;
			}
		System.out.println("Reverse the Number:"+rev);*/
		
		//Additional logic refer this link : https://www.youtube.com/watch?v=m0lMpNIG6vU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=2
	}

}
