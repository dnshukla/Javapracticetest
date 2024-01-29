package praticetest;

public class ClassTest {
	
	//This is the Main class
	public static void main(String []args) {
		System.out.println("Hello Main Class");
		
		//Create object of class in main to call the function
		ClassTest g1 = new ClassTest();
		g1.getdata();	
		
		//Create object of new class and get the details
		Users u1 = new Users();
		u1.getdata();
	}
	// Add one function to get data through main class
	public void getdata() {
		System.out.println("New class data");	
		}
}
class Users {
	int a1 = 15;
	int a2 = 25;
	int sum = a1+a2;
	//add one more class
	public void getdata() {
		System.out.println("Total sum of two values: "+sum);
	}
}
		