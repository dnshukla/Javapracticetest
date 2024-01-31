package praticetest;

public class ThisKeywordExamples {
	public static void main(String[] args) {
		Person p1 = new Person();	
	}
}
//This keyword examples:
class Person{
	String pname = "D.N.Shukla";
	
	//Call the method/function in the constructor
	  Person(){
		this.getuserdata();
	}
	  
	  //Call the properly in function
	  void getuserdata() {
		  System.out.println(this.pname);
	  }
}