package praticetest;

import java.io.File;

public class DeleteFileExample {
	
	public static void main(String[] args) {
		try {
			//Delete the existing file from the specific folder location
			File f1 = new File("Demotestfile/jvt2.txt");
			f1.delete();
			System.out.println(f1+"deleted successfully");
		}catch(Exception e) {
			System.out.println("Getting error"+e);
		}
	}
}
