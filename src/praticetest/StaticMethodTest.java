package praticetest;

public class StaticMethodTest {
	public static void main(String[] args) {
		State data1 = new State();
		data1.getdata();
		//Call static method/function in main class
		data1.fixdata();
	}
}

class State{
	// Add normal method/function
		void getdata() {
			System.out.println("Display normal method data.");
			
			//Call static method/function with in the class
			fixdata();
		}
		
		// Add static method/function
		static void fixdata() {
			System.out.println("Display static method data.");
		}
}