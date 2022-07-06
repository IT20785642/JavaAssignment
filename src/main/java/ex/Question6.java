package ex;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myArray = {2,4,7,3,8,5};
		
		for(int i=0;i<myArray.length;i++) {
			for(int j=i+1;j<myArray.length;j++) {
				int c = 0;
				
				if(myArray[i]>myArray[j]) {
					c = myArray[i];
					myArray[i]=myArray[j];
					myArray[j]=c;
				}
			}
			System.out.println(myArray[i]);
		}
		
		System.out.println("Second maximum number is " + myArray[myArray.length-2]);
	}

}
