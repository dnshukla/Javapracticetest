package praticetest;

public class MultipleConstructorExamples {
	public static void main(String[] args) {
		Userdetail ud1 = new Userdetail();
		Userdetail ud2 = new Userdetail("D.N.Shukla");
		Userdetail ud3 = new Userdetail(21);
	}
}

// Create multiple constructor and declare the object to get the data.
class Userdetail
{
		Userdetail(){
	   System.out.println("Display user details:");	
	}
	    Userdetail(String fullname){
		 System.out.println("Full Name:-"+fullname);	
	}
	    Userdetail(int age){
			 System.out.println("Age:-"+age);	
		}
}