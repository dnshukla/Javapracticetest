package Javaprograms;

import java.util.Scanner;

public class ReverseStringvalue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String value:");
		String str = scan.nextLine();
		
		// Using String buffer class
		StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        
        System.out.println("Reverse String value:"+sb);
        
      //Additional logic refer this link : https://www.youtube.com/watch?v=1_hhywLAO5o&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=3
	}

}
