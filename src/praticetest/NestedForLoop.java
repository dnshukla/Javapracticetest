package praticetest;

import java.util.Scanner;

public class NestedForLoop {
	public static void main(String []args) {
		//Add for loop with in the loop
		for(int i=1;i<=3;i++) {
			System.out.println("I value is:"+i);
			for(int j=1;j<=3;j++) {
				System.out.println(j);
			}
		}
		//Create Nested loop with user inputs
		System.out.println("Please maximul value of L loop:");
		System.out.println("Please maximul value of M loop:");
		Scanner scan = new Scanner(System.in);
			int maxlvalue = scan.nextInt();
			int maxMvalue = scan.nextInt();
		for(int l=1;l<=maxlvalue;l++) {
			System.out.println("L loop value:"+l);
			for(int m=0;m<=maxMvalue;m++) {
				System.out.println(m);
			}
		}
	}

}
