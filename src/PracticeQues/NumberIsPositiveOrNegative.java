package PracticeQues;

import java.util.Scanner;

public class NumberIsPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter any number: ");
		
		int no=reader.nextInt();
		if(no>=0)
		{
			System.out.println(no + "is a positive number");
		}
		else
			System.out.println(no + ": is a negative number");

	}

}
