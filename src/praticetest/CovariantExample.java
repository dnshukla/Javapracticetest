package praticetest;

public class CovariantExample {
	public static void main(String[] args) {
		Employees e1 = new Employees();
		e1.login();
	}
}
class Boss{
	Boss login(){
		System.out.println("Login with Boss");
		return this;
	}
}
//Add Covariant example with override keyword
class Employees extends Boss{
	@Override
	Employees login(){
		System.out.println("Login with Empoyee");
		return this;
	}
}