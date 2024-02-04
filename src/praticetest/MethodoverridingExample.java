package praticetest;

public class MethodoverridingExample {
	public static void main(String[] args) {
		Childtest ct1 = new Childtest();
		ct1.getuserdata();
	}
}
// Method overriding : with create same method in child inherit class of parent.
class Parenttest{
	void getuserdata() {
		System.out.println("Parent method to get the user data.");
	}
}

class Childtest extends Parenttest{
	void getuserdata() {
		System.out.println("Child method to get the user data.");
	}
}