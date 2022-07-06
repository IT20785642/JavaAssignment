package ex;
import java.util.*;

public class QuestionA6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet : ");
		char c = sc.next().charAt(0);

       /* if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            System.out.println(c + " is vowel");
        else
            System.out.println(c + " is consonant");
        */
		
	        switch (c) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(c + " is vowel");
	                break;
	            default:
	                System.out.println(c + " is consonant");
	        }
	}

}
