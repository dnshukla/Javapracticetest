package praticetest;

public class HybridInheritanceExample {
	public static void main(String[] args) {
		
		Testing t1 = new Testing();
		t1.gettesterdtails();
		t1.getdeveloperdetails();
		t1.getdepartmentdetails();
		
		Accounting a1 = new Accounting();
		a1.getAccounterdetails();
		
		Services s1 = new Services();
		s1.getservicedetails();
		s1.getqaservicedetails();
	}

}
//Multilevel Inheritance example : Parent, Child, Super child
class ItCompany{
	void getdepartmentdetails() {
		System.out.println("Available department list: Development, Testing, HR & Admin, Accounting");
	}
	public void getservicedetails() {
		System.out.println("Get It service details.");
	}
	public void getqaservicedetails() {
		System.out.println("Get QA service details.");
	}
}
class Development extends ItCompany{
	void getdeveloperdetails() {
		System.out.println("Available Developer list : Java, PHP, Python, Dot with C#");
	}
}
class Testing extends Development {
	void gettesterdtails() {
		System.out.println("Available tester list : Manual, Web Automation, Test Lead");
	}
}

//Hierarchical Inheritance example
class Accounting extends ItCompany{
	void getAccounterdetails() {
		System.out.println("Available accounter list: Auditor, GST Account, TDS & Tax audit");
	}
}

//Multiple Inheritance example
class Services implements Itservices,QAservices{
	public void getservicedetails() {
		System.out.println("Get It service details.");
	}
	public void getqaservicedetails() {
		System.out.println("Get QA service details.");
	}
}
interface Itservices{
	public void getservicedetails();
}
interface QAservices{
	public void getqaservicedetails();
}