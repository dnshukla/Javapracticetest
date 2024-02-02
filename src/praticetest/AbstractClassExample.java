package praticetest;

public class AbstractClassExample {
	public static void main(String[] args) {
		Devices d1 = new Devices();
		d1.getuifeatures();
		d1.getbodycolordetail();	
	}
}
// Add Abstract class with normal and  abstract function/method
abstract class Iphonedevice{
	//Add Normal function/method
	void getuifeatures() {
		System.out.println("Display the UI feature list");
	}
	//Add abstract function/method
	abstract void getbodycolordetail();
}

// Add Normal class with extends of abstract class
class Devices extends Iphonedevice{ 
	void getbodycolordetail() {
		System.out.println("Display the iPhone body color list");
	}
}