package ex;

public class QuestionA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 12345;
		 int rev = 0;
		    
		    System.out.println("Original Number: " + num);

		    while(num != 0) {
		    
		      int digit = num % 10;
		      rev = rev * 10 + digit;

		      num /= 10;
		    }

		    System.out.println("Reverse Number: " + rev);
	}

}
