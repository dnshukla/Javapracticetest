package praticetest;

public class HierarchicalInheritanceExample {
	public static void main(String[] args) {
		Businessuser bu1 = new Businessuser();
		bu1.Islogin();
		bu1.getBusinessusercounts();
		Operationuser ou1 = new Operationuser();
		ou1.Islogin();
		ou1.getOperationusercounts();
		Adminpanel au1 = new Adminpanel();
		au1.Islogin();
	}
}
/*Hierarchical Inheritance Example : 
*Make Adminpanel as parent class and inherit/call Login function/properly in other class thru object.*/ 
class Adminpanel{
	void Islogin() {
		System.out.println("User is login successfully. ");
	}
}
class Operationuser extends Adminpanel{
	void getOperationusercounts() {
		 System.out.println("Total count: 15");
	 }
}
class Businessuser extends Adminpanel{
	void getBusinessusercounts() {
		 System.out.println("Total count: 21");
	 }
}