package praticetest;

public class StaticVariables {
	public static void main(String[] args) {

		Statictest state1 = new Statictest();
		state1.getCounter();
		Statictest state2 = new Statictest();
		state2.getCounter();
		
		Normaltest normal1 = new Normaltest();
		normal1.getCounter();
		Normaltest normal2 = new Normaltest();
		normal2.getCounter();	
	}
}
//Add Class with Static variable example
class Statictest{
	static int counter = 0;
	void getCounter(){
		counter++;
		System.out.println(counter);
	} 
}

//Add Class with Normal variable example
class Normaltest{
	int counter = 0;
	void getCounter(){
		counter++;
		System.out.println(counter);
	} 
}