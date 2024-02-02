package praticetest;

public class AggregationExample {
	
	public static void main(String[] args) {
		
        Address a1 = new Address("B201","AHD", "IN");
        Employee e1 = new Employee("Dhairya",a1);
        e1.getemployeedetail();
	}

}
class Employee{
	String name;
	// Add aggregate of address class as variable to use the properly 
	Address address;
	
	//Add Constructor
	public Employee(String name, Address address){
		this.name=name;
		this.address=address;
	}
	void getemployeedetail() {
		System.out.println(this.name);
		System.out.println("Address detail :"+ address.Houneno + address.City + address.Country);
	}
}

class Address{
	String Houneno;
	String City;
	String Country;
	
	//Add Constructor
	public Address(String Houneno, String City, String Country) {
		this.Houneno=Houneno;
		this.City=City;
		this.Country=Country;
	}
}