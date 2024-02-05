package praticetest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNWriteFileExample {
	public static void main(String[] args) throws IOException {
		
		// Create File with .txt format
		File myf = new File("abc.pdf");
		if(myf.createNewFile()) {
			System.out.println("File has been created");
		}else {
			System.out.println("File already exist");
		}
		
		//Create and Write file with .txt format
		try (FileWriter myFW = new FileWriter("createNwrite.txt")) 
		{
		myFW.write("Hello user, welcome to java  with txt data.");
		myFW.close();
		}catch(Exception e)
		{
			System.out.println("File already exist"+e);
		}
	}
}