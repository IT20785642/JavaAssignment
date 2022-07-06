package ex;
import java.util.*;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many data do you want to store : ");
		int x = sc.nextInt();
		
		String twodArray[][] = new String[x][3];
		for(int i=0;i<x;i++) {
			for(int j=0;j<3;) {
				System.out.print("Enter your name : ");
				twodArray[i][j] = sc.next();
				j++;
				System.out.print("Enter your Age : ");
				twodArray[i][j] = sc.next();
				j++;
				System.out.print("Enter your Address : ");
				twodArray[i][j] = sc.next();
				j++;
			}
			System.out.println();
		}
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("| NAME \t\t AGE \t\t ADDRESS |");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		for(int i=0;i<x;i++) {
			System.out.print("|");
			for(int j=0;j<3;j++) {
				System.out.print(twodArray[i][j] + "\t\t");
			}
			System.out.println();
		}
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	}

}
