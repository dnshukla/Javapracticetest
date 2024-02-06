package praticetest;

public class TryCatchWithException {
	public static void main(String[] args) {
	
		// Use try catch with handle exception error
		int a = 100;
		try {
			System.out.println(a/5);
		}catch(Exception error){
			System.out.println("You cann't perform this operation.");
		}
		System.out.println("Hello for the second code.");
		
		// Use try catch with handle exception error and finally keyword
		int marks = 450;
		try {
			System.out.println(marks/0);
		}catch(Exception error){
			System.out.println("You cann't perform this operation.");
		}
		//Use finally keyword when run the code in all try catch condition
		finally {
			System.out.println("This message should run in both the cases.");
			}
		System.out.println("Hello for the Final code.");
	}

}
