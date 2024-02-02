package praticetest;

public class MultipleInheritanceExample {
	public static void main(String[] args) {
		
		Demoservices qa1 = new Demoservices();
		qa1.getManualtestingdata();
		qa1.getautomationtestingdata();
	}
}
// Add class with using function of two different parent interfaces:
class Demoservices implements manualtestingservices,automationtestingservices{
	public void getManualtestingdata() {
		System.out.println("To get the manual testing services");
	}
	
	public void getautomationtestingdata() {
		System.out.println("To get the automation testing services");
	}	
}
//Add two interface with respective function
interface manualtestingservices{
	void getManualtestingdata();
}
interface automationtestingservices{
	void getautomationtestingdata();
}