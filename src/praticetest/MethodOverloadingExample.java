package praticetest;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.getemployeename();
		e1.getemployeename("My name is Khan.");
		User u1 = new User();
		u1.getuserage(18);
		u1.getuserage("Eighteen");
	}
}

// Method overloading with different arguments:
class Emp{
	void getemployeename() {
		System.out.println("My name is Dhairya Shukla.");
	}
	void getemployeename(String name) {
		System.out.println(name);
	}
}

//Method overloading with different data type:
class User{
	void getuserage(int age) {
		System.out.println("Int age: "+age);
	}
	void getuserage(String age) {
		System.out.println("String age: "+age);
	}
}