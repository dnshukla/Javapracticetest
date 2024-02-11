package praticetest;

public class InheritanceTest {	
	public static void main(String[] args) {		

		// Create object of child class and call the parent class function		
		Child c1 = new Child();
		c1.getdata();
	}
}
// Add Normal Class
class Parents{
	String name = "Jone Peter";
	void getdata() {
		System.out.println(this.name);
	}
}
//Single Inheritance example
class Child extends Parents{
	
}
