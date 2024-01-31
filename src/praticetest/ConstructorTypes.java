package praticetest;

public class ConstructorTypes {
	public static void main(String[] args) {
		dconstruct dcon = new dconstruct();	
		pconstruct pcon = new pconstruct("Hello parameter construct.");	
	}
}
class dconstruct{
	//Example of the Default constructor
	int a = 10;
	int b = 20;
	int sum = a+b;
	dconstruct(){
		System.out.println("Total amount:"+sum);
	            }	
}

class pconstruct{
	//Example of the Parameterized constructor
	pconstruct(String data){
		System.out.println(data);
	}	
}