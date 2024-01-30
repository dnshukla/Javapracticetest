package praticetest;

public class StringsExamples {
	public static void main(String[] args) {
		String str = "Hello My name is Java.";
		
		//To print the string data.
		System.out.println(str);
		//To check the string character length
		System.out.println(str.length());
		//To check that string is empty or not
		System.out.println(str.isEmpty());
		//To remove the beginning character of the string
		System.out.println(str.substring(6));
		//To get the between character value within the string
		System.out.println(str.substring(17,21));
		//To replace character in the string
		System.out.println(str.replace("Java", "Javascript"));
		
		//To convert character array value into string
		char[] chr= {'H','E','L','L','O'};
		String str2 = new String(chr);
		System.out.println(str2);
	}

}
