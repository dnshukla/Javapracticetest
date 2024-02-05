package praticetest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
	public static void main(String[] args) throws FileNotFoundException {
		
		//Read the existing file through scanner class with function exception handle
		File fileObj = new File("C:\\Users\\DeLL\\Desktop\\Project_github keys.txt");
		Scanner read = new Scanner(fileObj);
			while(read.hasNextLine()) {
				String data = read.nextLine();
				System.out.println(data);
			}
			
	    //Read the existing file through scanner class with try catch exception handle
			try {
				File fileObj1 = new File("createNwrite.txt");
				Scanner read1 = new Scanner(fileObj1);
					while(read1.hasNextLine()) {
						String data = read1.nextLine();
						System.out.println(data);
					}
			}catch (Exception e) {
				System.out.println("Getting Error"+e);
			}
		}
	}
