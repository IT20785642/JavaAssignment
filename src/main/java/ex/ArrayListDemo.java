package ex;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		al.add(50);
		al.add(100);
		al.add("abc");
		al.add(2, 'a');
		al.remove(1);
		al.set(1, "dfg");
		
		System.out.print(al.indexOf("abc"));
	}

}
