package praticetest;

public class FunctionParams {

	public static void main(String[] args) {
		// Define the parameter value and call the function
		int userage1 = 1;
		getAgedays(userage1);
		
		int amount = 10000;
		int time = 2;
		int rate = 12;
		getInterestrate(amount,time,rate);
	}

	//Create static function with add single parameter 
	public static void getAgedays(int age) 
	{
		System.out.println("Your age is: "+(age*365));
	}
	
	//Create static function with add multiple parameters 	
	public static void getInterestrate(int amount,int time, int rate) 
	{
			System.out.println("Interest amount of your principal : "+((amount*time*rate)/100));
	}
}
