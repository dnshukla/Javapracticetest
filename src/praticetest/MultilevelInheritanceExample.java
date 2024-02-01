package praticetest;

public class MultilevelInheritanceExample {
	public static void main(String[] args) {
	    //Add object of super child class and call the child and parent class properly.
		Students s1 = new Students();
		s1.getTotalStudent();
		s1.getTotalTeachers();
		s1.getTotalClassroom();
		
		//Add object of child class and call the child and parent class properly.
		Teachers t1 = new Teachers();
		t1.getTotalTeachers();
		t1.getTotalClassroom();
	}
}
//Multilevel Inheritance example : Parent, Child, Super child
class Classroom{
	void getTotalClassroom() {
		System.out.println("Total Class room in the School: 25");
	}
}
class Teachers extends Classroom{
	void getTotalTeachers() {
		System.out.println("Total no. of teachers in the School: 50");
	}
}
class Students extends Teachers {
	void getTotalStudent() {
		System.out.println("Total no. of students in the School: 250");
	}
}