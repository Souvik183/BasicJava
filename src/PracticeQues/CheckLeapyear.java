package PracticeQues;

import java.util.Scanner;

public class CheckLeapyear {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter a year : ");
		
		long longnumber=reader.nextLong();
		
		if(longnumber%4==0)
		{
			if(longnumber%100==0)
			{
				if(longnumber%400==0)
				{
					System.out.println("You enetered leap year: "+longnumber);
				}
			}
		}
		else
		{
			System.out.println("You enetered not a leap year: "+longnumber);
		}
		

	}

}

//