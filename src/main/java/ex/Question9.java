package ex;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = {9,2,1,4,5,2,1,9,3,4};
		
		for(int i=0;i<myArray.length;i++) {
			int counter=0;
			for(int j=0;j<myArray.length;j++) {
					if(myArray[i]==myArray[j]) {
					counter++;
				}
			}
			System.out.println(myArray[i] + " : " + counter);
		}
	}

}
