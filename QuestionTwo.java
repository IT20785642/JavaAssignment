import java.util.ArrayList;
  public class QuestionTwo {
    public static void main(String[] args){
  ArrayList<Integer>  numbers = new ArrayList<Integer>();

  numbers.add(10);
  numbers.add(20);
  numbers.add(30);

  System.out.println("Original array list: " + numbers);
  int num = 50;
  numbers.set(1,num);

  System.out.println("Replace second element with 50."); 
  for(int i=0;i<numbers.size();i++)
  System.out.println(numbers.get(i));
  }
}