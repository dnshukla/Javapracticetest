package praticetest;

public class Operators {

	public static void main(String[] args) {
		// Types of Operators : Arithmetic, Assignment, Unary, shift, Relational, Bitwise, Logical, Ternary
		
		//Arithmetic operators ( Here a is 'operand' and '+/*' is operator )
		int a = 20;
		int b = 10;
		System.out.println(a+b); //Sum
		System.out.println(a-b); //sub
		System.out.println(a*b); //Mul
		System.out.println(a/b); //Div
		System.out.println(a%b); //Module
		
		//Unary operators : post unary, pre unary, tidle
		int c = 5;
		int d = 11;
		System.out.println(--c); //pre unary 
		c++;
		System.out.println(c); // post unary
		System.out.println(~d); // tidle to plus one value and convert into minus
		
		boolean bol1 = true;
		System.out.println(!bol1); // Add Negation to Convert the value
		
	}

}
