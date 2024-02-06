package praticetest;

public class ThrowNThrowsExample {
	public static void main(String[] args) {
		// User throw, When forcefully move your code in catch statement once fulfilled your condition
		try {
			int a = 10;
			System.out.println(a/2);
		if(a==10) {
			System.out.println("If condition");
			throw new ArithmeticException("Test");
		}
		}catch(ArithmeticException e) {
			System.out.println("Error"+e);
		}
		
		//If possible the error in the function at that time add 'Throws' after function signature
		try {
			getdata();
		}catch(Exception error){
			System.out.println("Error");
		}
	}
public static void getdata() throws Exception{
	System.out.println(15/0);
    }
}