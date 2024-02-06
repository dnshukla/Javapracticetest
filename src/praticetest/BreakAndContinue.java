package praticetest;

public class BreakAndContinue {
	public static void main(String []args) {
		//Break statement : Use this statement for the break loop once satisfied the condition
		int p = 5;
		for(int q=1;q<=10;q++) {
			if(p==q) {
				break;
			}
			System.out.println("Break Statement value:"+q);
		}
		
		//Continue statement : Use this statement for skip the specific loop and continue with remaining.
	    int l = 5;
	    for(int m=0;m<=10;m++) {
	    	if(m==l) {
	    		continue;
	    	}
	    	System.out.println("Continue Statement value:"+m);
	    }
	}
}
