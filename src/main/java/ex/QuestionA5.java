package ex;
import java.util.*;

public class QuestionA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number : ");
		int a = sc.nextInt();

	    System.out.print("Factors of " + a + " are: ");

	    for (int i = 1; i <= a; i++) {

	      if (a % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	}

}
