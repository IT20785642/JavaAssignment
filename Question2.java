public class Question2{
	static void swapNumbers(){
		int a = 10;
		int b = 15;
 		int c;
		c = a + b;
		a = c - a;
		b = c - b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public static void main(String args[]){
		swapNumbers();
	}
}