package ex;

public class QuestionA7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String word = "Alphabet";
		    int vowels = 0, consonants = 0;

		    word = word.toLowerCase();
		    for (int i = 0; i < word.length(); i++) {
		      char ch = word.charAt(i);

		      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		        vowels++;
		      }

		      else {
		        consonants++;
		      }
		      
		    }

		    System.out.println("Vowels: " + vowels);
		    System.out.println("Consonants: " + consonants);
	}

}
