package praticetest;

public class SingleInheritanceExamples {
	public static void main(String[] args) {
		
		//Add object of child class and display the parent properly data.
		Engine e1 = new Engine();
		//Call the parent class of same name
		e1.getcarname();
		//call the child class of same name
		e1.getcarname("Holna");
	}
}

//Add Parent class
class Car{
	//Add public function
	public void getcarname() {
		System.out.println("Honda");
	}
	//Add private function
	private void getRepair(){
		System.out.println("Engine repaird.");
	}
}
//Add Child class of Parent(Car)
class Engine extends Car{
	//Add same name of function which is available in parent class and see the result.
	void getcarname(String name) {
		System.out.println("Hello");
	}
}