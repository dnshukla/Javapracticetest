package praticetest;

public class SuperKeywordExample {
	public static void main(String[] args) {
		Dog dg1 = new Dog();
		dg1.getdogdata();
	}
}
class Animal{
	
	Animal(){
		System.out.println("Get Parent constructor data.");
	}
	int age = 3;
	void getanimaldata() {
		System.out.println("Get the animal data.");
	}
}

// Use the Super keyword to call the parent's method, properly and constructor in child class.
class Dog extends Animal{
	Dog(){
		super();
	}
	void getdogdata() {
		super.getanimaldata();
		System.out.println("Age : "+super.age);
	}
}