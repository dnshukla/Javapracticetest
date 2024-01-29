package praticetest;

import java.util.Scanner;

public class WhileLoopTest {
	public static void main(String []args) {
		// Add simple while loop
		int a = 0;
		while(a<3) {
			System.out.println(a);
			a++;	
		}
		
		// Add while loop with max value inputs
		System.out.println("Please enter max value:");
		Scanner scan = new Scanner(System.in);		
		int maxvalue = scan.nextInt();
		int data = 0;
		while(data<=maxvalue) {
			System.out.println(data);
			data++;
		}
		
		//Add while loop with If condition
		int b = 1;
		while(b<=50) {
			if(b%10==0) {
				System.out.println(b);
			}
			b++;	
		}
		
	}

}
