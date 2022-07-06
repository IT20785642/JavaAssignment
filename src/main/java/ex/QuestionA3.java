package ex;
import java.util.*;

public class QuestionA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		
		 int n1=0, n2=1, n3;
		 System.out.print(n1 + " " + n2 + " ");
		 int i = 3;
		 do {
			 n3 = n1 + n2;
			 System.out.print(n3 + " ");
			 n1 = n2;
			 n2 = n3;
			 i++;
		 }while(i<=a);
	}

}
