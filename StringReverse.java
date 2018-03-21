import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
       
        char[] savedInput = A.toCharArray();
        String reversed = "";

        for(int i = savedInput.length-1; i >= 0; i--) {
            reversed += savedInput[i]; //reversing
        }
        
        if(A.equals(reversed)) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        
	}

	
	/*  String reversed = new StringBuilder();
	 *  reversed.append(A).reverse().toString();
	    if(A.equals(reversed)) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }        
     
     */

	public class Adder extends StringReverse {}
}


