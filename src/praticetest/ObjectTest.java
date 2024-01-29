package praticetest;

import java.util.Scanner;

public class ObjectTest {
	public static void main(String []args) {
		
		//Create object of student class and call the functions
		Student s1 = new Student();
		System.out.println(s1.getage());
		s1.getname();
		
		//Create object of Teacher class with declare the variable and display the name
		Teacher t1 = new Teacher();
		String tn1 = "Dudo";
		t1.getteachername(tn1);
		
		//Create object of the default java class with receive input from the user
		System.out.println("Enter your role number:");
		try (Scanner scan = new Scanner(System.in)) {
			int no = scan.nextInt();
			System.out.println(no);
		}
		
	}

}
// Add student class
class Student{
	int getage() {
		return 18;
	}
	void getname() {
		System.out.println("Dhairya Shukla");	
	}
}
//Add teacher class
class Teacher {
	void getteachername(String tname) {
		System.out.println(tname);
	}
}