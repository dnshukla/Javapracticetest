package praticetest;

public class StaticClassExample {

	public static void main(String[] args) {
		//Call the static class
		Parent.Child ch1 = new Parent.Child();
		ch1.getChildata();	
	}
}
/*Create class with 'static' keyword within Parent class known as static class.
* you can call static class in outside of the main parent class.
* you can only call static properly/function with in the static class. 
* you cann't call normal properly/function in static class*/
class Parent{
	static class Child{
		void getChildata() {
			String childuser = "Static child class data.";
			System.out.println(childuser);
		}
	}
}