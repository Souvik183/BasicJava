package PracticeQues3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter a no to check prime number : ");
		
		int number=reader.nextInt();
		
		boolean flag=false;
		
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println(number+ ": is a prime number");
		}
		System.out.println(number+ ": is not a prime number");
	}
	

}
