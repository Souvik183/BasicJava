package PracticeQues2;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter a no to reverse : ");
		
		int number=reader.nextInt();
		int rev=0;
		
		while(number!=0)
		{
			int n =number%10; // 1) 123%10=3  2) 12%10=2 3) 1%10=1
			rev=rev*10 + n ; //1) 3 2) 32 3) 321
			number=number/10;//1) 123/10=12 2) 12/10=1 3) 1/10=0 LOOP FINISHED
		}
		System.out.println(rev);

	}

}
