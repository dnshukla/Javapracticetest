package praticetest;

public class Literals {

	public static void main(String[] args) {
		
		// Four types of literals : integer, character, Boolean, String
		
		/*Sub types of integer literals : Decimal, Octal (start with 0), 
		 * Hexa-decimal (start with ox/0X), Binary (start with 0b)
		 */
		int decimal1 = 867;
		System.out.println(decimal1);
		
		int octal1 = 067;
		System.out.println(octal1);
		
		int hexa1 = 0x78d;
		System.out.println(hexa1);
		
		int hexa2 = 0X0000a;
		System.out.println(hexa2);
		
		int binary1 = 0b1001;
		System.out.println(binary1);
		
		char ch1 = '\u0011';
		System.out.println(ch1);
		
		//Sting & float literals
		
		float f1 = 00.56734f;
		System.out.println(f1);
		
		String st1 = "abc123!@#:{}?,";
		System.out.println(st1);
		
		String st2 = null;
		System.out.println(st2);

	}

}
