package praticetest;

import java.io.FileWriter;

public class WriteMultipleFilesExample {
	public static void main(String[] args) {
		
		try {
			
			//Create & write multiple file in specific folder
			for(int i=1;i<=2;i++) {
				String Filename = "Demotestfile/jvt"+i+".txt";
				FileWriter writer = new FileWriter(Filename);
				writer.write("Hello java test file create"+Filename);
			    writer.close();
			    System.out.println(Filename+"created");
			}
			
		}catch(Exception e) {
			System.out.println("Getting Erroe"+e);
		}
		
	}

}
