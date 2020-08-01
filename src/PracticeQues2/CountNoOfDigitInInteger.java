package PracticeQues2;

import java.util.Scanner;

public class CountNoOfDigitInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//12345-- means 5 digits are there
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter a digit : ");
		
		int number=reader.nextInt();
		
		int count=0;
		while(number!=0)
		{
			number=number/10; //for 123 -- 12 1 0
			count++;//1 2 3
		}
		System.out.println("Count no of the digit:" +count);
	}

}
