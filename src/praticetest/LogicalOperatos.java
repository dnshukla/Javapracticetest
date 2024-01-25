package praticetest;

public class LogicalOperatos {

	public static void main(String[] args) {
		// Logical operators : [ && (AND), || (OR), !(Not)] Use to check the Multiple condition
		int a = 10;
		int b = 11;
		int c = 12;
		System.out.println(a==b && a==c); // Fulfill both the conditions
		System.out.println(a==b || a==c); // Fulfill any of one condition
		System.out.println(!(a==b || a==b)); // To get opposite value of the conditions

	}

}
