package ex;
import java.util.*;

public class QuestionA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = input.nextInt();
		int value = 1;
		for(int i=1;i<=a;i++) {
			value = value * i;
		}
		System.out.println(value);
	}

}
