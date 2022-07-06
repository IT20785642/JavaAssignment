package ex;
import java.util.*;
public class Question7 {
	
	static void swapNumbers(int x,int y) {
		int [] myArray = {2,4,9,5,8,3,6};
		
		Scanner input = new Scanner(System.in);
		System.out.println("x : ");
		x = input.nextInt();
		System.out.println("y : ");
		y = input.nextInt();
		
		int i = myArray[x];
		myArray[x] = myArray[y];
		myArray[y] = i;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
