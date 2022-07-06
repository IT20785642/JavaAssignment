package ex;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] myArray = {'t','a','b','l','e'};
		char[] myArray2 = {'c','h','a','i','r'};
		boolean b=false;
		
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]!=myArray2[i]) {
				System.out.println("Words are not same");
				break;
			}
			b = true;
		}
		if(b==true) {
			System.out.println("Words are same");
		}
	}

}
