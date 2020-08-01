package PracticeQues3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		// reverse is same like 121, reverse is also 121
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter a no to reverse to check palindrome : ");
		
		int number=reader.nextInt();
		int rev=0;
		int originalnum=number;
		
		while(number!=0)
		{
			int n =number%10;
			rev=rev*10 + n ; 
			number=number/10;
		}
		if(originalnum==rev)
		{
			System.out.println(rev+ ": is a palindrome number");
		}
		else
		System.out.println(rev+ ": is not a palindrome number");
	}

}
