package praticetest;

import java.util.Scanner;

public class ArrayWithInputs {
	public static void main(String[] args) {
		//Create object of scanner class and store the user inputs
		System.out.println("Please enter total element of Array: ");
		Scanner scan = new Scanner(System.in);
		int totalinput = scan.nextInt();
		
		//Strong user inputs as array max size and store array values. 
		int inputArr[]= new int[totalinput];
		System.out.println("Please enter Array element of values: ");
		for(int i=0;i<totalinput;i++) {
			inputArr[i]=scan.nextInt();
		}
		//Display the entered array values
		System.out.println("Array elements are here: ");
		for(int i=0;i<totalinput;i++) {
			System.out.println(inputArr[i]);
		}
	}

}
