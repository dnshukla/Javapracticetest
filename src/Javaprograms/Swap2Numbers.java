package Javaprograms;

public class Swap2Numbers {
	
	public static void main(String[] args) {
		// Swap the Two Numbers: 
		int a=10, b=20;
		System.out.println("Before swapping values:"+a+ " "+b);	
		
		//Logic 1: with using Third variable 
		/*int t = a; // output is t=10
		a=b; // output is a=20
		b=t; // output is b=10
		System.out.println("After swapping values with logic 1:"+a+ " "+b); */
		
		//Logic 2: with using + & - operator
		/*a=a+b; // 10+20 = 30
		b=a-b; // 30-20 = 10
		a=a-b; // 30-10 = 20
		
		System.out.println("After swapping values with logic 2:"+a+ " "+b); */
		
		//Logic 3: with using * & / operator
		a=a*b; // 10*20 = 200
		b=a/b; // 200/20 = 10
		a=a/b; // 200/10 = 20
		System.out.println("After swapping values with logic 3:"+a+ " "+b);
		
		//Additional logic refer this link : https://www.youtube.com/watch?v=3vbizK6KzaU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=1
	}
	
}
