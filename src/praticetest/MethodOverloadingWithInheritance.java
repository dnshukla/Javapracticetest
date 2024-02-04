package praticetest;

public class MethodOverloadingWithInheritance {
	public static void main(String[] args) {
		Childs c1 = new Childs();
		c1.getuserdata("Get the child user data");
	}
}
//Method overloading with Inheritance
class Base{
	void getuserdata() {
		System.out.println("Get the Parent user data.");
	}
}

class Childs extends Base{
	void getuserdata(String data) {
		System.out.println(data);
	}
}