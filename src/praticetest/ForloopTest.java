package praticetest;

public class ForloopTest {
	
	public static void main(String []args)
	{
		//Create simple for loop example increment mode
		for(int a=1;a<=3;a++) {
			System.out.println("Hello");
		}
		//create another for loop example decrement mode
		int b=5;
		for(b=5;b>1;b--) {
			System.out.println(b);
		}
		//create another for loop example with If condition
				int c=1;
				for(c=1;c<=50;c++) {
					if(c%10 == 0) 
					{
						System.out.println("Display the 0 moduler data:"+c);	
					}
					}
    }
}