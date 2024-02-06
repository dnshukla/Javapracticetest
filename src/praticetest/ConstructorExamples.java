package praticetest;

public class ConstructorExamples {
	public static void main(String[] args) {
		Studentname s1 = new Studentname();
		String tname = "Dhiraj Shah";
		Teachername t1 = new Teachername(tname);
		String sch = "Dhimant School";
		Schoolname sch1 = new Schoolname(sch);
		System.out.println(sch1.chname);
	}
}
//Add class with Constructor with user name and automatically call once run the main function
class Studentname{
	String sname;
	Studentname(){
		System.out.println("Dhairya shukla");
	}
}
//Add class with Constructor with print teacher name which add into main class 
class Teachername{
	String name;
	Teachername(String tname){
		System.out.println(tname);
	}
}
//Add class with Constructor with store name in the properly and print automatically once run the main function
class Schoolname{
	String chname;
	Schoolname(String data){
		this.chname=data;
	}
}