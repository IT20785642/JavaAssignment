package ex;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = {1,1,1,1,2,2,3,4,5,5,6,6};
		
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
