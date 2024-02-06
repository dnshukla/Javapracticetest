package praticetest;

public class TwoDArray {
	public static void main(String[] args) {
		
		//Add 2D array and print the values with using loops
		String str[][]= new String[2][2];
		str[0][0]="AB";
		str[0][1]="BC";
		str[1][0]="AA";
		str[1][1]="BB";
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length;j++) {
				System.out.println(str[i][j]);
			}
		}
	}

}
