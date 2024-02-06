package praticetest;

public class InterfaceExample {
	public static void main(String[] args) {
		Companydata cd1 = new Companydata();
		cd1.getmaleemployeedata();
		cd1.getfemaleemployeedata();
		cd1.getloguserdata();
	}
}
//Add class
class Companydata implements companyuserdetail {
	
	//Add interface method in class
	public void getmaleemployeedata() {
		System.out.println("Total no. of Male Employee : 61");	
	}
	public void getfemaleemployeedata() {
		System.out.println("Total no. of Male Employee : 43");	
	}
	
	//Add extra method in class
	void getloguserdata() {
		System.out.println("Total login user list : 104");
	}
	
}
//Add Interface with two methods
interface companyuserdetail{
	void getmaleemployeedata();
	void getfemaleemployeedata();
}