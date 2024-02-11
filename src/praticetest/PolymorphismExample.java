package praticetest;

public class PolymorphismExample {
	public static void main(String[] args) {
		
		//Compile time polymorphism & MethodOverloading & Static binding
		Compiletime ct1 = new Compiletime();
		ct1.getuserdata("Hello Dhairya");
		ct1.getuserdata();
		//Run time polymorphism & MethodOverriding & Dynamic binding
		Runtimechild rt1 = new Runtimechild();
		rt1.getparentclassdata("Get the Child class detail");
		rt1.getparentclassdata();
	}
}
//Overloading example
class Compiletime{
	void getuserdata() {
		System.out.println(8);
	}
	void getuserdata(String name) {
		System.out.println(name);
	}	
}
//Overriding example
class Runtimeparent{
	void getparentclassdata() {
		System.out.println("Get the parent class detail");
	}
}
class Runtimechild extends Runtimeparent{
	void getparentclassdata(String data) {
		System.out.println(data);
	}
}
