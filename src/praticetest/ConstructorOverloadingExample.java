package praticetest;

public class ConstructorOverloadingExample {
	public static void main(String[] args) {
		Teach t1 = new Teach();
		Teach t2 = new Teach("Teaching Constructor overload in java.");
		Teachernumber tc1 = new Teachernumber(10);
		Teachernumber tc2 = new Teachernumber("Ten");
		
	}
}
//constructor overloading with different arguments:
class Teach{
	Teach(){
		System.out.println("Teaching Java language.");
	}
	Teach(String data){
		System.out.println(data);
	}
}
//constructor overloading with different data types:
class Teachernumber{
	Teachernumber(int number){
		System.out.println("Total no. of teachers in number:"+number);
	}
	Teachernumber(String number){
		System.out.println("Total no. of teachers in word:"+number);
	}
}
