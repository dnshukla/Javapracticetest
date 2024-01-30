package praticetest;

public class ArrayTest {

	public static void main(String[] args) {
		//Create single array to get single value result.
		int marks[] = new int[3];
		marks[0]=10;
		marks[1]=22;
		marks[2]=35;
		System.out.println(marks[2]);
		
		//Add for loop with array to get the all marks detail.
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		//Create single array in another way (which is very simple and low code usage)
		String skills[]= {"Php","Java","Node js"};
		System.out.println(skills[2]);
	}
}
