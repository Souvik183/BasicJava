package PracticeQues2;

public class CharectarIsAlphabetOrNot {

	public static void main(String[] args) {
		
		char c= 'y';
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		{
			System.out.println(c+ ": is alphabet");
		}
		else
			System.out.println(c+ ": is not alphabet");

	}

}
