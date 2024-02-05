package praticetest;

public class FinalKeywordExample {
	public static void main(String [] args) {
	    Usercl u1 = new Usercl();
	    System.out.println(u1.name);
	    u1.updatename();
	    System.out.println(u1.name);
//	    childcl c1 = new childcl();
//	    c1.updatename();
	}
}
// Use 'Final' keyword with properly and function
class Usercl{
	final String name = "Dhairya";
	final void updatename(){
		//this.name = "Dhiraj";
	}
}

class childcl extends Usercl{
//	void updatename(){
//		System.out.println("Hello world");
//	}
}