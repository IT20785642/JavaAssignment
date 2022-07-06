package ex;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//String fname = "radar";
		System.out.println("Name : ");
		
		String fname = input.next();
		
		String revName = "";
		
		for(int i=fname.length()-1;i>=0;i--) {
			revName = revName + fname.charAt(i);
			//System.out.println(revName);
		}
		
		if(fname.equals(revName)) {
			System.out.println(fname + " is a palindrome");
		}
		else {
		System.out.println(fname + " is not a palindrome");
		}
	}

}
