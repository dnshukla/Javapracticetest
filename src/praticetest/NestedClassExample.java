package praticetest;

public class NestedClassExample {
	public static void main(String[] args) {
		Room tname1 = new Room();
		tname1.teacher();
	}
}
/*Create class within the class known as Nested class. There is no limit to create class in Parent class. 
* you cann't call nested class in outside of the main parent class. This is the limitation on it.
* Nested class Example:*/
class Room {
	class Student {
		void getstudentdata() 
		{
			System.out.println("Hello Student.");
		}
	}
	void teacher() {
		System.out.println("Welcome Teacher.");
		Student stud1 = new Student();
		stud1.getstudentdata();
	}
}
